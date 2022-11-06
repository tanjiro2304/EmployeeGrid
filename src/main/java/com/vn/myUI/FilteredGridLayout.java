package com.vn.myUI;

import com.vaadin.data.HasValue;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vn.models.Employee;
import com.vn.repo.EmployeeData;

public class FilteredGridLayout extends VerticalLayout {
    private final EmployeeGrid employeeGrid;
    private final TextField nameFilter;

    public FilteredGridLayout(){

        nameFilter = new TextField("Name...");
        nameFilter.addValueChangeListener(this::onNameFilterTextChange);
        addComponent(nameFilter);
        employeeGrid = new EmployeeGrid();
        addComponentsAndExpand(employeeGrid);

    }

    private void onNameFilterTextChange(HasValue.ValueChangeEvent<String> stringValueChangeEvent) {
        ListDataProvider<Employee> dataProvider = (ListDataProvider<Employee>) employeeGrid.getDataProvider();
        dataProvider.setFilter(Employee:: getFirstName,
                s-> caseInsensitiveContains(s,stringValueChangeEvent.getValue()));

    }

    private Boolean caseInsensitiveContains(String where, String what){
        return where.toLowerCase().contains(what.toLowerCase());
    }
}

package com.vn.myUI;

import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vn.models.Employee;
import com.vn.repo.EmployeeData;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGrid extends Grid<Employee> {
    public EmployeeGrid(){
        EmployeeData employeeData = new EmployeeData();
        List<Employee> employees = employeeData.getEmployeeList();


        addColumn(Employee::getEmployeeId).setCaption("Employee Id");
        addColumn(Employee::getFirstName).setCaption("First Name");
        addColumn(Employee::getLastName).setCaption("Last Name");
        addColumn(Employee::getSalary).setCaption("Salary");

        setItems(employees);
    }
}

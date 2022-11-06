package com.vn.myUI;


import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import com.vn.models.Employee;
import com.vn.repo.EmployeeData;
import org.w3c.dom.Text;

import java.util.List;

@SpringUI
public class MainUI extends UI {
    private VerticalLayout root =new VerticalLayout();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
//        mainLayout();
        gridLayout();
        setLayout();
    }

    private void setLayout() {

        setContent(root);
    }


    private void mainLayout() {

        root.setSizeFull();
        Button button = new Button("Push" +
                "");
        button.addClickListener(event-> {
            Notification.show("You Pushed It.");
        });
        root.addComponent(button);
    }

    private void gridLayout(){
        VerticalLayout layout = new VerticalLayout();
        FilteredGridLayout filteredGridLayout = new FilteredGridLayout();

        layout.addComponent(filteredGridLayout);
        layout.setComponentAlignment(filteredGridLayout,Alignment.MIDDLE_CENTER);
        root.addComponent(layout);
        root.setComponentAlignment(layout, Alignment.MIDDLE_CENTER);

    }


}

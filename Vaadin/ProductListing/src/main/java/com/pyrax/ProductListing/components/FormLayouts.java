package com.pyrax.ProductListing.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class FormLayouts extends VerticalLayout {

    private FormLayout formLayout = new FormLayout();

    public FormLayouts() {
        addComponent("First Name");
        addComponent("Last Name");
        addComponent("Email");
        buttonComponent("Save", "LUMO_PRIMARY");
        add(formLayout);
    }
    private void addComponent(String lbl){
        TextField x = new TextField();
        x.setWidthFull();
        formLayout.addFormItem(x,lbl);
    }

    private void buttonComponent(String x, String y){
        Button b = new Button(x);
        b.addThemeVariants(ButtonVariant.valueOf(y.toUpperCase()));
        HorizontalLayout btn = new HorizontalLayout();
        btn.setWidthFull();

        btn.add(b);
        formLayout.addFormItem(btn,"").getElement().setAttribute("colspan", "3");
    }
}

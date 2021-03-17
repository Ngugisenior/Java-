package com.pyrax.ProductListing;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import com.pyrax.ProductListing.components.FormLayouts;

@Route
public class About extends VerticalLayout {
    public About() {
        add(new FormLayouts());
    }

}

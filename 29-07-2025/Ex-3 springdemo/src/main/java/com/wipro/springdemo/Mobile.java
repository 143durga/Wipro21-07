package com.wipro.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

    private Display display;

    // Constructor-based DI
    @Autowired
    public Mobile(Display display) {
        this.display = display;
    }

    public void showDetails() {
        System.out.println("📱 Mobile with display size: " + display.getSize() + " inches");
    }
}

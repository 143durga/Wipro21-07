package com.wipro.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private int size = 6; // default value

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

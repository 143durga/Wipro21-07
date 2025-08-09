package com.wipro.oop;

public class Rectangle extends Shape {
    double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle → " + super.toString() + ", Length: " + length + ", Width: " + width;
    }
}

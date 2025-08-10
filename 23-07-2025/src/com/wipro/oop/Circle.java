package com.wipro.oop;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String toString() {
        return "Circle → " + super.toString() + ", Radius: " + radius;
    }
}

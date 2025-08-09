package com.wipro.oop.test;

import com.wipro.oop.Circle;
import com.wipro.oop.Rectangle;
import com.wipro.oop.Square;

public class Shapetest {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        Rectangle r = new Rectangle("Blue", 10.0, 4.0);
        Square s = new Square("Green", 6.0);

        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
    }
}

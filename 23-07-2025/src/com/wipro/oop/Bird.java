package com.wipro.oop;

public class Bird extends Animal{
public Bird(String name) {
        super(name);
    }

   public void sound() {
        System.out.println(name + " tiktik");
    }

}

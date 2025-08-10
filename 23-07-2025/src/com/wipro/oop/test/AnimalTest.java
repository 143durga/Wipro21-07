package com.wipro.oop.test;

import com.wipro.oop.Bird;
import com.wipro.oop.Human;
import com.wipro.oop.Dog;

public class AnimalTest {
	public static void main(String[] args) {
        Human h = new Human("Durga");
        Dog d = new Dog("Pluto");
        Bird b = new Bird("parrot");

        h.sound(); h.eat();
        d.sound(); d.eat();
        b.sound(); b.eat();
    }

}

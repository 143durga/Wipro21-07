package com.wipro.oop;

public abstract class Animal {
	String name;
	
public	Animal(String name){
		this.name = name;
	}
public	abstract void sound();
public	void eat() {
		System.out.println(name + "is eating");
	}

}

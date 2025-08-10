package com.wipro.basic;

public class Conditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char shape='C';
		shape=Character.toUpperCase(shape);
		switch (shape) {
		case'R':
		System.out.println("Rectangle");
		break;
	    case'C':
	    System.out.println("Circle");
	    break;
        case'S':
        System.out.println("Square");
        break;
        default:
        	System.out.println("Other"); 
        }

	}

}

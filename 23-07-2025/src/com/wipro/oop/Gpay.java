package com.wipro.oop;

public class Gpay implements PaymentMethod{
	
//Method overriding
	public void pay(double amount) {
		System.out.println("paid using Gpay"+ " " + amount);
	}
//Method overloading	
	public void pay(double amount, String note) {
        System.out.println("Paid using GPay" +" " + amount +" " +"Note: " + note);
    }

}

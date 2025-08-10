package com.wipro.Solid;

public class PhonePay implements Payment {
	
	public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePay");
    }

}

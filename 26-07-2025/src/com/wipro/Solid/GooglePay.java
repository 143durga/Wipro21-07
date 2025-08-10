package com.wipro.Solid;

public class GooglePay implements Payment {
	
	public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using GooglePay");
    }

}

package com.wipro.oop;

public class phonePay implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid using PhonePay" +" " + amount);
    }
}
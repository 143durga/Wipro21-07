package com.wipro.Solid;

public class PaymentService {
	Payment payment;
	
	public PaymentService(Payment payment) {
        this.payment = payment;
    }
	public void processPayment(double amount) {
        payment.makePayment(amount);
    }

}

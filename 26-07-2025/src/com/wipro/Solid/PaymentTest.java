package com.wipro.Solid;



public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GooglePay googlePay = new GooglePay();
        PaymentService service1 = new PaymentService(googlePay);
        service1.processPayment(1500);
        
        Payment phonePay = new PhonePay();
        PaymentService service2 = new PaymentService(phonePay);
        service2.processPayment(2500);
        
        Paytm paytm = new Paytm();
        PaymentService service3 = new PaymentService(paytm);
        service3.processPayment(1000);
    }
		
		

	}


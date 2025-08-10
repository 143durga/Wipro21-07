package com.wipro.oop.test;

import com.wipro.oop.PaymentMethod;
import com.wipro.oop.Gpay;
import com.wipro.oop.phonePay;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethod pm = new Gpay();
        pm.pay(700.0);
        
        Gpay gpay = new Gpay();
        gpay.pay(300.0, "Bill Payment");
        
        pm = new phonePay();
        pm.pay(990.0);

	}

}

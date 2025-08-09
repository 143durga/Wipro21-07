package com.wipro.oop;

public class Citi implements Bankoperations {
     
    public double withdraw(double amount, String accNumber) {
                System.out.println(amount+ "," + accNumber);
				return amount;
            
    }
    public void deposite(double amount, String accNumber) {
        System.out.println(amount+ "," + accNumber);
    
    }
}

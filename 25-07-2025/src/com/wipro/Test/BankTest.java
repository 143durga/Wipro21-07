package com.wipro.Test;
import com.wipro.Anonymus.*;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOps savingsAccount = new BankOps() {
			public void deposit(double amount) {
                System.out.println("Deposited ₹" + amount + " into Savings Account.");
            }
        };
        
        BankOps currentAccount = new BankOps() {
            @Override
            public void deposit(double amount) {
                System.out.println("Deposited ₹" + amount + " into Current Account.");
            }
        };
		
        savingsAccount.deposit(5000);
        currentAccount.deposit(10000);

	}

}

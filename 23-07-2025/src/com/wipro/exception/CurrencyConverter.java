package com.wipro.exception;

public class CurrencyConverter {
	
	
	 public static double changeCurrency(double amount) throws NumberFormatException {
	        if (amount == 0) {
	            throw new NumberFormatException("Invalid Number");
	        }
	        return amount * 20; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            double result = changeCurrency(0); 
            System.out.println("Converted amount: ₹" + result);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

	}

}

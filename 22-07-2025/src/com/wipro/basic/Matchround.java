package com.wipro.basic;

public class Matchround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=25.586d;
		double n2=25.589d;
		long num1=Math.round(n1*1000);
		long num2=Math.round(n2*1000);
		if(num1==num2) {
		System.out.println("same");
		}
		else {
			System.out.println("Not same");
		}
	}

}

package com.wipro.basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="madam";
		StringBuilder sb=new StringBuilder(word);
		String reversed=sb.reverse().toString();;
		if(word.equals(reversed)) {
			System.out.println("Palindrome");
			
		}
		else {
		System.out.println("Not Palindrome");
		}

	}

}

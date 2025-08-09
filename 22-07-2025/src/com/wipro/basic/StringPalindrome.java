package com.wipro.basic;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String  str="madam";
     String reverse = "";

     // Reverse the string
     for (int i = str.length() - 1; i >= 0; i--) {
         reverse = reverse + str.charAt(i);
     }

     // Check if the original string is equal to the reversed string
     if (str.equals(reverse)) {
         System.out.println(str + " is a palindrome.");
     } else {
         System.out.println(str + " is not a palindrome.");
     }
	}

}

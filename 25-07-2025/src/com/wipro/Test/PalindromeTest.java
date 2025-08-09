package com.wipro.Test;
import com.wipro.Anonymus.*;
import java.util.function.Predicate;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Predicate<String> isPalindrome = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	        
	     System.out.println(isPalindrome.test("madam"));
	        System.out.println(isPalindrome.test("racecar"));
	}
}


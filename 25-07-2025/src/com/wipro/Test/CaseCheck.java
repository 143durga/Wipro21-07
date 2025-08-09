package com.wipro.Test;
import java.util.function.Predicate;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());
		Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());
		System.out.println(" Uppercase " + isUpperCase.test("DURGA"));  // true
        System.out.println(" Lowercase " + isLowerCase.test("durga"));


	}

}

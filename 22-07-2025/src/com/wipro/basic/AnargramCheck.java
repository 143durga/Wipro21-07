package com.wipro.basic;

import java.util.Arrays;

public class AnargramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="race";
		String str2="care";
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anargram");
		}
		else {
			System.out.println(" Not Anargram");
			
		}

	}

}

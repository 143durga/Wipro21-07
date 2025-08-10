package com.wipro.exception;

public class NullpointException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		
		try {
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e){
			System.out.println("Null Point Exception");
		}

	}

}

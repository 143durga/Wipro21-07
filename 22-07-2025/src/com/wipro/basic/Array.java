package com.wipro.basic;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,4,3,2,5};
		for(int i =0;i<numbers.length;i++) {
			numbers[i]= numbers[i]*2;
		}
        System.out.println("Doubled values");
        for(int i =0;i<numbers.length;i++) {
        	System.out.println(numbers[i]);
        	
        }
        
	}

}

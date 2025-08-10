package com.wipro.optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Optional<Integer> optNumber = Optional.of(42);
		 optNumber.ifPresent(val -> System.out.println("Value is: " + val));
		 Optional<Integer> emptyOpt = Optional.empty();
	        int result = emptyOpt.orElse(100);
	        System.out.println("Default value: " + result);

	}

}

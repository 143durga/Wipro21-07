package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CalAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Double average = numbers.stream()
                .collect(Collectors.averagingDouble(n -> n));

        System.out.println("Average: " + average);
	}

}

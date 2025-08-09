package com.wipro.collections;
import java.util.ArrayList;

public class ArrayListElements {
	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Original list: " + numbers);
        numbers.remove(2);
        System.out.println("After removing: " + numbers);
        numbers.add(60);

        System.out.println("After adding: " + numbers);
    }
}




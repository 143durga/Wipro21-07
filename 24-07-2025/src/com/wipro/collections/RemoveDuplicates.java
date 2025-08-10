package com.wipro.collections;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
        names.add("Durga");
        names.add("Bhavani");
        names.add("Durga");
        names.add("Sai");
        names.add("Bhavani");
        System.out.println("Original List: " + names);
        Set<String> uniqueNames = new HashSet<>(names);
        List<String> finalList = new ArrayList<>(uniqueNames);
        System.out.println("List after removing duplicates: " + finalList);

	}

}

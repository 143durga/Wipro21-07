package com.wipro.stream;
import java.util.*;
import java.util.stream.Collectors;


public class StreamNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<String> names = Arrays.asList("Jayanta", "Jayantha", "Jnanedra", "Sajida", "Ajay");

        List<String> result = names.stream()
                                   .filter(name -> name.toLowerCase().contains("ja"))
                                   .collect(Collectors.toList());

        System.out.println(result);

	}

}

package com.wipro.collections;
import java.util.Set;
import java.util.HashSet; //No duplicated,No Sorted
//import java.util.TreeSet; //No duplicates,Ascending order, Sorted

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> setA = new HashSet<>();
		setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        Set<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println(difference);

	}

}

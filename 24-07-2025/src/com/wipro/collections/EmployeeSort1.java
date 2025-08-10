package com.wipro.collections;

import java.util.*;

public class EmployeeSort1{
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();

        list.add(new Employee2("E103", "Alice", 30, 60000));
        list.add(new Employee2("E101", "Bob", 25, 85000));
        list.add(new Employee2("E104", "Charlie", 35, 75000));
        list.add(new Employee2("E102", "David", 28, 92000));

        Collections.sort(list); // uses Comparable to sort by salary

        System.out.println("Sorted by Descending Salary:");
        for (Employee2 emp : list) {
            System.out.println(emp);
        }
    }
}

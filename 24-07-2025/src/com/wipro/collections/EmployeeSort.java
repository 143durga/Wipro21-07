package com.wipro.collections;

import java.util.*;

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("E103", "Alice", 30));
        employees.add(new Employee1("E101", "Bob", 25));
        employees.add(new Employee1("E104", "Charlie", 35));
        employees.add(new Employee1("E102", "David", 28));

        Collections.sort(employees, new SortByEmpId());
        System.out.println("Sorted by empId:");
        for (Employee1 e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new SortByEmpName());
        System.out.println("\nSorted by empName:");
        for (Employee1 e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new SortByEmpAge());
        System.out.println("\nSorted by empAge:");
        for (Employee1 e : employees) {
            System.out.println(e);
        }
    }
}

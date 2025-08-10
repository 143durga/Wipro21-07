package com.wipro.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Employee {
	String empId;
    String empName;
    int empAge;
    double empSalary;
    
    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

public double getEmpSalary() {
    return empSalary;
}

@Override
public String toString() {
    return empId + " - " + empName + " - Age: " + empAge + " - Salary: ₹" + empSalary;
}

}

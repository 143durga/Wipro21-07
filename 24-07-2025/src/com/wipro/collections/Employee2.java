package com.wipro.collections;

public class Employee2 implements Comparable<Employee2> {
    String empId;
    String empName;
    int empAge;
    double empSalary;

    public Employee2(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public int compareTo(Employee2 other) {
        // Sort in descending order of salary
        return Double.compare(other.empSalary, this.empSalary);
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - Age: " + empAge + " - Salary: ₹" + empSalary;
    }
}

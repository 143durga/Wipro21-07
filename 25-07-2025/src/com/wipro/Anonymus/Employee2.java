package com.wipro.Anonymus;

public class Employee2 {
    private String empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee2(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - Age: " + empAge + " - Salary: " + empSalary;
    }
}

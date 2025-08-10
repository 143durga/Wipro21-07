package com.wipro.springdemo;

public class College {
    private String collegeName;
    private Department1 department;

    // Constructor-based DI
    public College(String collegeName, Department1 department) {
        this.collegeName = collegeName;
        this.department = department;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public Department1 getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "College [collegeName=" + collegeName + ", department=" + department + "]";
    }
}

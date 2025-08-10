package com.wipro.springdemo;

public class Department1 {
    private String deptCode;
    private String departmentName;

    // ✅ Constructor for Constructor-based DI
    public Department1(String deptCode, String departmentName) {
        this.deptCode = deptCode;
        this.departmentName = departmentName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department1 [deptCode=" + deptCode + ", departmentName=" + departmentName + "]";
    }
}

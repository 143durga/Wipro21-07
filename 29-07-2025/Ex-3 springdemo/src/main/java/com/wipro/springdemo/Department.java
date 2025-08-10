package com.wipro.springdemo;

public class Department {
	private String deptCode = "Fin";
    private String departmentName ="Finance";

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    @Override
    public String toString() {
        return "Department [deptCode=" + deptCode + ", departmentName=" + departmentName + "]";
    }
}

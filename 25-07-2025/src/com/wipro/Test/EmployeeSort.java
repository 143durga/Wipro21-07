package com.wipro.Test;

import com.wipro.Anonymus.*;
import java.util.List;
import java.util.ArrayList;

public class EmployeeSort {

    public static void main(String[] args) {
        List<Employee2> empList = new ArrayList<>();
        empList.add(new Employee2("E3", "Durga", 30, 70000));
        empList.add(new Employee2("E1", "Sai", 25, 90000));
        empList.add(new Employee2("E4", "Charan", 35, 85000));
        empList.add(new Employee2("E2", "Anu", 28, 75000));

        empList.sort((e1, e2) -> Double.compare(e2.getEmpSalary(), e1.getEmpSalary()));
        for (Employee2 e : empList) {
            System.out.println(e);
        }
    }
}

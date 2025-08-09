package com.wipro.collections;

import java.util.Comparator;

public class SortByEmpName implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.ENAME.compareTo(e2.ENAME);
    }
}

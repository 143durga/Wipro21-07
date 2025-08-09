package com.wipro.collections;

import java.util.Comparator;

public class SortByEmpId implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.EID.compareTo(e2.EID);
    }
}

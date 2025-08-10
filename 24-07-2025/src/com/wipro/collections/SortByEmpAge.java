package com.wipro.collections;

import java.util.Comparator;

public class SortByEmpAge implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return Integer.compare(e1.EAGE, e2.EAGE);
    }
}

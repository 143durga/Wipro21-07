package com.wipro.collections;

public class Employee1 {
    public String EID;
    public String ENAME;
    public int EAGE;

    public Employee1(String EID, String ENAME, int EAGE) {
        this.EID = EID;
        this.ENAME = ENAME;
        this.EAGE = EAGE;
    }

    @Override
    public String toString() {
        return EID + " - " + ENAME + " - Age: " + EAGE;
    }
}

package com.wipro.oop.test;

import com.wipro.oop.HDFC;
import com.wipro.oop.Citi;

public class Banktest {
    public static void main(String[] args) {
        HDFC h = new HDFC();
        h.deposite(1043,"3456789");
        Citi c = new Citi();
        c.deposite(1563,"3569369");
    }
}

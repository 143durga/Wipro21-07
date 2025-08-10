package com.wipro.Test;

import com.wipro.Exceptions.*;
public class MonthTest {

    // Method to check valid month
    public static void checkMonth(int month) throws InvalidMonthException {
        if (month > 12 || month < 1) {
            throw new InvalidMonthException("Invalid month!");
        } else {
            System.out.println("Valid month: " + month);
        }
    }

    public static void main(String[] args) {
        try {
            checkMonth(15);  // Change this to test (e.g., 5 or 0)
        } catch (InvalidMonthException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
	}

}

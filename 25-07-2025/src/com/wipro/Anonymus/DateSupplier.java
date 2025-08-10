package com.wipro.Anonymus;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class DateSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> DateSupplier = () -> LocalDate.now().getDayOfWeek().plus(1).toString();
        System.out.println("Tomorrow is: " + DateSupplier.get());

	}

}

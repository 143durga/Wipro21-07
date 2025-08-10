package com.wipro.basic;

public class EnumMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum Month {
			JANUARY,
			FEBRAUARY,
			MARCH,
			APRRIL,
			MAY,
			JUNE,
			JULY,
			AUGUST,
			SEPTEMBER,
			OCTOMBER,
			NOVEMBER,
			DECEMBER
		}
		
//		Day day=Day.Mon;
//		if(day==Day.Mon)
//		{
//			System.out.println("Monday");
//		}
		
		for(Month m:Month.values())
		{
			System.out.println(m);
		}

	}

}

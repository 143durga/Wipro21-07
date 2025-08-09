package com.wipro.stream;

import java.util.Arrays;
import java.util.List;

public class ExpensiveFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItems f1 = new FoodItems("Spring Rolls", "Veg", "Chinese", 150);
        FoodItems f2 = new FoodItems("Fried Rice", "Non-Veg", "Chinese", 250);
        FoodItems f3 = new FoodItems("Paneer Butter Masala", "Veg", "Indian", 200);
        FoodItems f4 = new FoodItems("Chicken", "Non-Veg", "Chinese", 300);

		List<FoodItems> list = Arrays.asList(f1, f2, f3, f4);

        FoodItems Result = list.stream()
                .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
                .reduce((a, b) -> a.getPrice() > b.getPrice() ? a : b)
                .orElse(null);

        System.out.println(Result);
    }
}


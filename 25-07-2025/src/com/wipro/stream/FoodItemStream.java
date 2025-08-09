package com.wipro.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FoodItemStream {

    public static void main(String[] args) {

        FoodItems f1 = new FoodItems("Spring Rolls", "Veg", "Chinese", 120);
        FoodItems f2 = new FoodItems("Chicken Lollipop", "Non Veg", "Chinese", 180);
        FoodItems f3 = new FoodItems("Pad Thai", "Veg", "Thai", 200);
        FoodItems f4 = new FoodItems("Fried Rice", "Veg", "Chinese", 150);
        FoodItems f5 = new FoodItems("Manchurian", "Veg", "Chinese", 140);

        List<FoodItems> foodList = Arrays.asList(f1, f2, f3, f4, f5);

        Comparator<FoodItems> comp = (a, b) -> Double.compare(a.price, b.price);

        List<FoodItems> chineseList = foodList
                .stream()
                .filter(p -> p.cuisine.equalsIgnoreCase("Chinese"))
                .sorted(comp.reversed()) 
                .collect(Collectors.toList());

        chineseList.forEach(System.out::println);
    }
}

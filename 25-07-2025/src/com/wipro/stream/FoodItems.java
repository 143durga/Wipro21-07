package com.wipro.stream;

public class FoodItems{
    String foodName;
    String foodType;
    String cuisine;
    double price;

    public FoodItems(String foodName, String foodType, String cuisine, double price) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.cuisine = cuisine;
        this.price = price;
    }
    
    public String getCuisine() {
        return cuisine;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return foodName + " - " + foodType + " - " + cuisine + " - ₹" + price;
    }
}

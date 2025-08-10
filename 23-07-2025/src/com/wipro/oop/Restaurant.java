package com.wipro.oop;

public class Restaurant {

	String name;
	String location;
	int price;
	String email;
	public Restaurant(String k, String l,int m,String n) {
        name = k;
        location = l;
        price = m;
        email = n;
    }

    public String toString() {
        return "Name: " + name + ", Location: " + location + "price: " + price +", email: " + email;
    }

}

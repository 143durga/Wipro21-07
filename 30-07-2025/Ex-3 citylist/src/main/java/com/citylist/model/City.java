package com.citylist.model;


public class City {
    private String name;
    private String country;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}

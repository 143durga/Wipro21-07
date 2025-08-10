package com.touristmgmt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tourist_place")
public class TouristPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "place_name", nullable = false)
    private String name;

    @Column(name = "place_type", nullable = false)
    private String type;

    @Column(nullable = false)
    private String state;

    @Column(name = "product_make", nullable = false)
    private String productMake;

    @Column(name = "product_price", nullable = false)
    private double productPrice;

    public TouristPlace() {}

    public TouristPlace(String name, String type, String state, String productMake, double productPrice) {
        this.name = name;
        this.type = type;
        this.state = state;
        this.productMake = productMake;
        this.productPrice = productPrice;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getProductMake() { return productMake; }
    public void setProductMake(String productMake) { this.productMake = productMake; }

    public double getProductPrice() { return productPrice; }
    public void setProductPrice(double productPrice) { this.productPrice = productPrice; }
}

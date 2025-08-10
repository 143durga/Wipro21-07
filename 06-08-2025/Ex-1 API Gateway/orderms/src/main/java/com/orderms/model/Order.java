package com.orderms.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders") // ✅ Renamed to avoid MySQL keyword conflict
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;
    private double orderValue;

    @Transient // Payments come from PaymentMS, not stored in DB
    private List<Payment> payment;

    public Order() {}

    public Order(String orderNumber, double orderValue) {
        this.orderNumber = orderNumber;
        this.orderValue = orderValue;
    }

    public Order(String orderNumber, double orderValue, List<Payment> payment) {
        this.orderNumber = orderNumber;
        this.orderValue = orderValue;
        this.payment = payment;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }
}

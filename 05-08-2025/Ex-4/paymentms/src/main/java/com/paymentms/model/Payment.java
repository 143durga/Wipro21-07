package com.paymentms.model;

import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int orderId;
    private boolean paymentStatus;
    private double paymentAmount;

    // Default constructor
    public Payment() {}

    // All-args constructor
    public Payment(int id, int orderId, boolean paymentStatus, double paymentAmount) {
        this.id = id;
        this.orderId = orderId;
        this.paymentStatus = paymentStatus;
        this.paymentAmount = paymentAmount;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}

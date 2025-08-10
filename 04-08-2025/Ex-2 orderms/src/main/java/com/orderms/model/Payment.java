package com.orderms.model;

public class Payment {

    private int id;
    private int orderId;
    private boolean paymentStatus;
    private double paymentAmount;

    // Default constructor
    public Payment() {}

    // Constructor with only status (if you want simpler POST too)
    public Payment(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

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

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", paymentStatus=" + paymentStatus +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}

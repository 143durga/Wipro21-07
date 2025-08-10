package com.wipro.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "pan")
public class Pan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String panholderName;
    private String panNumber;

    public Pan() {}

    public Pan(String panholderName, String panNumber) {
        this.panholderName = panholderName;
        this.panNumber = panNumber;
    }

    public int getId() { return id; }
    public String getPanholderName() { return panholderName; }
    public void setPanholderName(String name) { this.panholderName = name; }
    public String getPanNumber() { return panNumber; }
    public void setPanNumber(String panNumber) { this.panNumber = panNumber; }
}

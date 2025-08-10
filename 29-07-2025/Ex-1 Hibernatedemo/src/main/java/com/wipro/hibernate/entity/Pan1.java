package com.wipro.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "pan1")
public class Pan1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String panholderName;
    private String panNumber;

    public Pan1() {}
    
    public Pan1(int id, String panholderName, String panNumber) {
        this.id = id;
        this.panholderName = panholderName;
        this.panNumber = panNumber;
    }

    public Pan1(String panholderName, String panNumber) {
        this.panholderName = panholderName;
        this.panNumber = panNumber;
    }

    public int getId() { return id; }
    public String getPanholderName() { return panholderName; }
    public void setPanholderName(String name) { this.panholderName = name; }
    public String getPanNumber() { return panNumber; }
    public void setPanNumber(String panNumber) { this.panNumber = panNumber; }
    
    @Override
    public String toString() {
        return "Pan1 [id=" + id + ", panholderName=" + panholderName + ", panNumber=" + panNumber + "]";
    }
}

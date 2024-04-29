package com;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    private String brand;
    private String model;
    private int year;

    public Vehicle() {}

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

   
}



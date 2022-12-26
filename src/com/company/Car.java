package com.company;

public class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }


    public void gas() {
        //...газ
    }

    public void brake() {
        //...тормоз
    }
}



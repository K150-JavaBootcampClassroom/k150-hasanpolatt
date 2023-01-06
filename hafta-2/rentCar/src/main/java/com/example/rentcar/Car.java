package com.example.rentcar;

public class Car {
    private String brand;
    private String model;
    private int modelYear;
    private String color;
    private int baggage;

    public Car(String brand, String model, int modelYear, String color, int baggage) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.color = color;
        this.baggage = baggage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }
}

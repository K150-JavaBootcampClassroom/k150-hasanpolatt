package com.example.rentcar;

public class Car {
    private int modelYear;
    private String model;
    private String color;
    private int baggage;
    private int maxSpeed;

    public Car(int modelYear, String model, String color, int baggage, int maxSpeed) {
        this.modelYear = modelYear;
        this.model = model;
        this.color = color;
        this.baggage = baggage;
        this.maxSpeed = maxSpeed;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void priceDay(int day){
        int price = 100*day;
        System.out.println("Kiralama ücreti = " + price);
    }
}

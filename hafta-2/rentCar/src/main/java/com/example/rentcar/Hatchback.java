package com.example.rentcar;

public class Hatchback extends Car {

    public Hatchback(int modelYear, String model, String color, int baggage, int maxSpeed) {
        super(modelYear, color, model, baggage, maxSpeed);
    }
    private int monthly = 3000;

    public void rentForMonth(int month){
        int price = monthly*month;
        System.out.println("Kiralama ücreti: " + price);
    }

}

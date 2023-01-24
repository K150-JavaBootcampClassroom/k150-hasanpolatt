package com.example.rentcar;

public class Sedan extends Car {

    public Sedan(int modelYear, String model, String color, int baggage, int maxSpeed) {
        super(modelYear, model, color, baggage, maxSpeed);
    }
    private int monthly = 3000;

    public void rentForMonth(int month){
        int price = monthly*month;
        System.out.println("Kiralama ücreti: " + price);
    }

}

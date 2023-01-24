package com.example.rentcar;

public class Suv extends Car {
    public Suv(int modelYear, String model, String color, int baggage, int maxSpeed) {
        super(modelYear, model, color, baggage, maxSpeed);
    }

    private int daily = 100;
    private int monthly = 2400;

    public void rentForMonth(Suv suv,int month) {
        int price = monthly*month;

        System.out.println("Kiralama Ücreti: " + price);
    }

    public void rentForDay(Suv suv,int day){
        int price = daily*day;

        System.out.println("Kiralama ücreti: " + price);
    }
}

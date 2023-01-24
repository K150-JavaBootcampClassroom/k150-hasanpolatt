package com.example.rentcar;

public class Company extends Customer {

    public Company(String personalName) {
        super(personalName);
    }


    public void rentCarMonth(Sedan sedan, int month) {
        System.out.println("Aracı " + month + " aylığına kiraladınız.");
        sedan.rentForMonth(month);
    }
    public void rentCarDaily(Hatchback hatchback, int day){
        System.out.println("Aracı " + day + " günlüğüne kiraladınız.");
        hatchback.rentForMonth(day);
    }
    public void rentCarDaily(Suv suv, int day){
        System.out.println("Aracı " + day + " günlüğüne kiraladınız.");
        suv.rentForDay(suv, day);
    }

    public void rentCarMonth(Suv suv, int month) {
        System.out.println("Aracı " + month + " aylığına kiraladınız.");
        suv.rentForMonth(suv, month);
    }
}

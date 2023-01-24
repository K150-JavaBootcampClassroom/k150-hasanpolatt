package com.example.rentcar;


public class Customer extends Operations{
    private String personalName;

    public Customer(String personalName) {
        this.personalName = personalName;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public void rentCarDaily(Hatchback hatchback, int day) {
        System.out.println("Araç " + day + " günlüğüne kiralandı.");
        hatchback.priceDay(day);

    }
}

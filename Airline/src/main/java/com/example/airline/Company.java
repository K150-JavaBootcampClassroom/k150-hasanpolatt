package com.example.airline;

public class Company {
    private String airlineId;
    private String airlineName;

    public Company() {
        this.airlineId = "";
        this.airlineName = "";
    }

    //constructor 02
    public Company(String airlineID, String name) {
        this.setAirlineId(airlineID);
        this.setAirlineName(name);

    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}

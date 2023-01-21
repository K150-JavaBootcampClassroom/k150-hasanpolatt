package com.example.airline;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TurkishAirlines {

    private String flightNumber;
    private String departureDate;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;
    private SeatSection[] sections;
    public TurkishAirlines(String flightNumber, String departureAirport, String destinationAirport, String departureTime,
                           String arrivalTime, int day, int month, int year) {
        String airlineId = flightNumber.substring(0,2);
        String number = flightNumber.substring(2);
        this.setFlightNumber(airlineId, number);
        //setDepartureDate(year, month, day);
        this.departureAirport = departureAirport.toUpperCase();
        this.destinationAirport = destinationAirport.toUpperCase();
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.sections = sections;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String airlineId, String number) {
        if (airlineId.matches("[a-zA-Z]+$") && airlineId.length()==2 && number.matches("[0-9 ]+$")){
            this.flightNumber = airlineId + number;

        } else {
            System.out.println("Geçersiz uçuş numarası.");
        }
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");     //Defines the date format needed
        Calendar calendar1 = new GregorianCalendar(2023, 1, 19);   //creates a date from Calendar class
        this.departureDate = sdf.format(calendar1.getTime());
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        if (departureAirport.matches("[a-zA-Z]+$") && departureAirport.length()==3){
            this.departureAirport = departureAirport.toUpperCase();
        } else {
            System.out.println("Geçersiz havayolu.");
        }
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        if (destinationAirport.matches("[a-zA-Z]+$") && destinationAirport.length()==3){
            this.destinationAirport = destinationAirport.toUpperCase();
        } else {
            System.out.println("Geçersiz havayolu.");
        }
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm ");     //Defines the date format needed
        Calendar calendar1 = new GregorianCalendar(2023, 1, 19);   //creates a date from Calendar class
        this.departureTime = sdf.format(calendar1.getTime());

    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public SeatSection[] getSections() {
        return sections;
    }

    public void setSections(SeatSection[] sections) {
        this.sections = sections;
    }
}

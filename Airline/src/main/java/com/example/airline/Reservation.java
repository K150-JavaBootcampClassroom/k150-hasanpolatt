package com.example.airline;


public class Reservation {
    private int reservationNumber;
    private String flightNumber;
    private int numberOfPassengers;
    private Passenger[] passengers;
    private Seat[] reservedSeats;

    public Reservation(int reservationNumber, int numberOfPassengers, Passenger[] passenger, String flightNumber,
                       String departureDate, Seat[] reservedSeats) {
        this.reservationNumber = reservationNumber;
        this.numberOfPassengers = numberOfPassengers;
        this.passengers = passenger;
        this.flightNumber = flightNumber;
        this.reservedSeats = reservedSeats;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public Passenger[] getPassengers() {
        for(int i=0; i<passengers.length; i++){
            System.out.println(passengers[i]);
        }
        return passengers;
    }

//    public Passenger[] getPassengersArray() {
//
//        return passengers;
//    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Seat[] getReservedSeats() {
        String[] reservedSeatId = new String[this.getNumberOfPassengers()];
        for (int i=0; i<reservedSeats.length; i++) {
            reservedSeatId[i] = reservedSeats[i].getSeatId();
        }
        return reservedSeats;
    }

    public void setReservedSeats(Seat[] reservedSeats) {
        this.reservedSeats = reservedSeats;
    }
}

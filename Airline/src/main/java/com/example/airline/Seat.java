package com.example.airline;

public class Seat {
    private String seatId;
    private boolean isEmpty;

    public Seat(String seatId, boolean isEmpty) {
        this.seatId = seatId;
        this.isEmpty = isEmpty;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

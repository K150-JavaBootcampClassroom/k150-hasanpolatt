package com.example.airline;

import com.example.airline.SeatClass;
import com.example.airline.Seat;
public class SeatSection {

    private SeatClass seatClass;

    public SeatSection() {
        this.seatClass = null;
    }

    public SeatSection(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public void setSeatClass(String seatId) {
        String seatColumn = "";
        int seatNumber = 0;

        seatColumn = String.valueOf(seatId.charAt(0));
        seatNumber = Integer.parseInt(seatId);

        if(seatNumber >= 1 && seatNumber <=12) {
            switch(seatColumn) {
                case "A":
                case "B":
                case "C":
                case "D":
                    this.seatClass = SeatClass.ECONOMY;
                    break;
                default:
                    System.out.println("Geçersiz koltuk numarası.");
                    break;
            }
        }
        else if(seatNumber >= 5 && seatNumber <= 12) {
            switch(seatColumn) {
                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "H":
                    this.seatClass = SeatClass.BUSINESS;
                    break;
                default:
                    System.out.println("Geçersiz koltuk numarası.");
                    break;
            }
        }
    }
}

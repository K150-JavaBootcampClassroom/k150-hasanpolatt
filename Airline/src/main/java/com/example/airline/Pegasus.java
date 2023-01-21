package com.example.airline;

public class Pegasus {
    private String pegasusId;
    private String city;
    private String country;

    public Pegasus() {
        this.pegasusId = "";
        this.city = "";
        this.country = "";
    }

    public Pegasus(String pegasusId, String city, String country) {
        this.setPegasusId(pegasusId);
        this.setCity(city);
        this.setCountry(country);
    }

    public void setPegasusId(String pegasusId) {
        if(pegasusId.matches("[a-zA-Z]+$") && pegasusId.length()==3) {
            this.pegasusId = pegasusId.toUpperCase();
        } else {
            System.out.println("Geçersiz havaalanı.");
        }
    }

    public void setCity(String city) {
        if (city.matches("[a-zA-Z ]+$")) {
            this.city = city;
        } else{
            System.out.println("Geçersiz şehir.");
        }
    }

    public void setCountry(String country) {
        if (country.matches("[a-zA-Z ]+$")) {
            this.country = country;
        } else{
            System.out.println("Geçersiz havayolu");
        }
    }

    public String getPegasusId() {
        return pegasusId;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}

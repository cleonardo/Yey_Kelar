package com.example.bookparadise.models;

public class Library {

    private int id;
    private String li_name, li_address, li_phone;
    private double latitude, longitude;

    public Library(int id, String li_name, String li_address, String li_phone, double lat, double longi){
        this.id=id;
        this.li_name=li_name;
        this.li_address=li_address;
        this.li_phone=li_phone;
        this.latitude=lat;
        this.longitude=longi;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLi_phone() {
        return li_phone;
    }

    public void setLi_phone(String li_phone) {
        this.li_phone = li_phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLi_name() {
        return li_name;
    }

    public void setLi_name(String li_name) {
        this.li_name = li_name;
    }

    public String getLi_address() {
        return li_address;
    }

    public void setLi_address(String li_address) {
        this.li_address = li_address;
    }
}

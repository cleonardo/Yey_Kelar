package com.example.bookparadise.models;

import android.os.Parcel;
import android.os.Parcelable;

public class User{

    private String idUser, username, email, password, fullName, address, phoneNumber;

    public User(String idUser, String username, String email, String password, String fullName, String address, String phoneNumber){

        this.idUser=idUser;
        this.username=username;
        this.email=email;
        this.password=password;
        this.fullName=fullName;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

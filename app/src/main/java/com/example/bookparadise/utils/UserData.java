package com.example.bookparadise.utils;

import com.example.bookparadise.models.User;

import java.util.ArrayList;

public class UserData {
    private static ArrayList<User> users = new ArrayList<>();
    private static UserData data;

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        UserData.users = users;
    }

    public static UserData getData() {
        if(data == null) {
            data = new UserData();
            users.add(new User("MB001", "admin", "admin@bookparadise.com", "admin","Admin" , "Jl. Kebon Jerok No. 21", "08123456789"));
            users.add(new User("MB002", "Denny_h0", "Denny_h@bookparadise.com", "Den0123","Denny Hogwart", "jl. panjang no 12", "089863217865"));
        }
        return data;
    }

    private UserData(){
        users = new ArrayList<>();
    }

    public void add(User user) {
        users.add(user);
    }

    public static void setData(UserData data) {
        UserData.data = data;
    }


}

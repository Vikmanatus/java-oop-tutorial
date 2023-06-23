package com.vikman.enterprise.javaooptutorial.exercises.phonechallenge;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String phoneNumber;
    private String address;
    private ArrayList<Message> messages;

    public Contact(String name, String phoneNumber, String address, ArrayList<Message> messages) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

}

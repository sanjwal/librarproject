package org.librarynewyork.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Card {
    public String id;
    public String name;
    public String expiry;
    public String phoneNumber;
    public String address;
    public String gender;
    public String dob;
    public String email;
    public int booksCheckOutCount;


    public Card(String id, String name, String expiry, String phoneNumber, String address, String gender, String dob, String email, int booksCheckOutCount) {
        this.id = id;
        this.name = name;
        this.expiry = expiry;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.booksCheckOutCount = booksCheckOutCount;
    }
}


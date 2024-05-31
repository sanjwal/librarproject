package org.librarynewyork.models;

import java.util.ArrayList;

public class User {

    public String username;
    public String password;
    public String firstName;
    public String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}



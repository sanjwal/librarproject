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

    public static ArrayList<User> sampledata() {
        User user1 = new User("user1", "123", "sanjwal", "sr");
        User user2 = new User("user2", "321", "jim", "alex");
        ArrayList<User> allUsers = new ArrayList<User>();
        allUsers.add(user1);
        allUsers.add(user2);

        return allUsers;
    }
}

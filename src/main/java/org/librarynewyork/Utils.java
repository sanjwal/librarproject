package org.librarynewyork;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.librarynewyork.models.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    Scanner scanner;

    public Utils() {
        scanner = new Scanner(System.in);
    }


    public void close() {
        scanner.close();
    }

    public String scanStringValue(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public int scanIntValue(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }


    public void writeContent(String file, String content) {
        try {
            File myObj = new File(file);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {

            }
            FileWriter myWriter = new FileWriter("data.json");
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }


    public String readContent(String file) {
        try {
            File myObj = new File(file);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {

            }
            return new String(Files.readAllBytes(Paths.get(file)));
        } catch (IOException e) {
            return null;
        }
    }

    public void landingFlow() {
        // on landing page there is two options:
        // 1. Admin Login
        // 2. User Login
        System.out.println("*********** Welcome to Newyork Library *************");
        int input = scanIntValue("Press 1 for Admin login and 2 for User login");

        if (input == 1) {
            // open admin login page or cli workflow
            adminLoginFlow();
        } else if (input == 2) {
            // open user login flow
            userLoginFlow();
        } else{
            System.out.println("Incorrect choice entered please try again!");
            landingFlow();
        }

    }

    public void adminLoginFlow(){
        System.out.println("******* Admin  Login *********");
        String username = scanStringValue("Enter user name");
        String password = scanStringValue("Enter your password");
        String readUserJson = readContent("user.json");

        // this logic convert our json text/string to list of objects/users
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<User> allUsers = gson.fromJson(readUserJson, new TypeToken<ArrayList<User>>(){}.getType());

        // two types of loop
        // 1 index based
        // 2. object based

        for(int i = 0; i <allUsers.size() ; i++){
            User selected = allUsers.get(i);

            if(username.equals(selected.username) && password.equals(selected.password)){
                // here is correct username and password entered
                adminLoginSuccess(selected);
                return;
            }

        }

        // if our logic reach here that mean no username found in our data
        System.out.println("Username or Password incorrect please try again!");
        adminLoginFlow();





    }

    public void userLoginFlow(){
        System.out.println("******** User Login Area **********");
    }

    public void adminLoginSuccess(User selected){
        System.out.println("****** Welcome " + selected.firstName + " *********");
    }

}


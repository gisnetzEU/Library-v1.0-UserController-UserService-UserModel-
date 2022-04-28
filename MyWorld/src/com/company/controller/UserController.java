package com.company.controller;

import com.company.model.User;
import com.company.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;

public class UserController {
    //just an arraylist to store users
    static ArrayList<User> users = new ArrayList<>();

    public static HashMap<String, String> createUser(HashMap<String, String> dataToCreateUser) {

        String name = dataToCreateUser.get("name");
        String surname = dataToCreateUser.get("surname");
        int age = Integer.parseInt(dataToCreateUser.get("age"));
        long cardNumber = Long.parseLong((dataToCreateUser.get("cardNumber")));
        double amount = Double.parseDouble(dataToCreateUser.get("amount"));
        String cardType = dataToCreateUser.get("cardType");

        //Let s introduce data to create User
       //User createdUser = new User(name, surname, age, new Card(cardNumber, amount, cardType));

        //Let s add this new User object to the main (and just one) array
        //boolean statusOperation = users.add(createdUser);

        HashMap<String, String> createUserResponse = new HashMap<>();
        createUserResponse.put("response", "createUserResponse");

        //if (statusOperation) createUserResponse.put("status", "created");
        //else createUserResponse.put("status", "not created");

        return createUserResponse;
    }







    public static void loan() {
    }


    public static ArrayList<User> getFakeUsers() {
        return users;
    }
}

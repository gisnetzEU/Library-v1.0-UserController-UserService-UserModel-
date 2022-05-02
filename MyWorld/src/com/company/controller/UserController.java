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
        String birthdate = dataToCreateUser.get("birthdate");
        String address = dataToCreateUser.get("address");
        String email = dataToCreateUser.get("email");
        String phoneNumber = dataToCreateUser.get("phoneNumber");


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

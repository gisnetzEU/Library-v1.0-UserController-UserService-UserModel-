package com.company.controller;

import com.company.model.*;

import java.util.HashMap;
import java.util.UUID;

public class LendingController {

    static UserMap users = UserController.getUsers();
    static EjemplarList ejemplares = EjemplarController.getEjemplares();
    static LendingMap lendings = new LendingMap();

    public static HashMap<String, String> createLending(HashMap<String, String> request) {
        // Unpacking data
        String userId = request.get("userId");
        String ejemplarId = request.get("ejemplarId");

        // Getting user object by id and ejemplar object by id
        User user = users.getUserById(userId);
        Ejemplar ejemplar = ejemplares.findBySku(UUID.fromString(ejemplarId));

        // Creating the new lending object and put into lendings "map" object
        Lending newLending = new Lending(user, ejemplar);
        boolean statusOperation = lendings.addLending(newLending);

        // Building response HashMap
        HashMap<String, String> createLendingResponse = new HashMap<>();
        createLendingResponse.put("response", "createLendingResponse");

        // Add response HashMap data
        if (statusOperation) {
            createLendingResponse.put("status", "success");
            createLendingResponse.put("message", "Lending created successfully.");
        } else {
            createLendingResponse.put("status", "fail");
            createLendingResponse.put("message", "Failure in lending creation process.");
        }

        return createLendingResponse;

    }
}

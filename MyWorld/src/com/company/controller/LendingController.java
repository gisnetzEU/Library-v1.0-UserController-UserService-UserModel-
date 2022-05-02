package com.company.controller;

import com.company.model.Ejemplar;
import com.company.model.Lending;
import com.company.model.LendingMap;
import com.company.model.User;

import java.util.HashMap;

public class LendingController {

    static HashMap<String, Lending> lendings = new LendingMap;


    public static HashMap<String, String> createLending(HashMap<String, String> request) {

        String userId = request.get("userId");
        String ejemplarId = request.get("ejemplarId");

        User user = getUserById();
        Ejemplar ejemplar = getEjemplarById();

        Lending newLending = new Lending(user, ejemplar);
        Lending statusOperation = lendings.put(String.valueOf(newLending.getLendingUuid()), newLending);


        HashMap<String, String> createLendingResponse = new HashMap<>();
        createLendingResponse.put("response", "createLendingResponse");

        if (statusOperation) createLendingResponse.put("status", "created");
        else createLendingResponse.put("status", "not created");

        return createLendingResponse;

    }
}

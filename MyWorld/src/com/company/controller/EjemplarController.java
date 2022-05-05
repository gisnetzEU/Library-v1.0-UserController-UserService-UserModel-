package com.company.controller;

import com.company.model.Ejemplar;
import com.company.model.EjemplarList;
import com.company.model.User;

import java.util.HashMap;
import java.util.UUID;

public class EjemplarController {

    static EjemplarList lista = new EjemplarList();

    public static void createEjemplar(String titulo, String author) {
        Ejemplar ejemplar = new Ejemplar(titulo, author);
        lista.add(ejemplar);
    }

    public static HashMap<String, String> listItems() {
        String itemsList = lista.toString();
        HashMap<String, String> listItemsResponse = new HashMap<>();
        listItemsResponse.put("response", "listUsersResponse");
        if(!itemsList.equals("Items Map:\n")) {
            listItemsResponse.put("status", "List exists");
            listItemsResponse.put("message", itemsList);
        } else {
            listItemsResponse.put("status", "List doesnt's exists");
            listItemsResponse.put("message", "No items");
        }
        return listItemsResponse;
    }

    public static EjemplarList getEjemplares() {
        return lista;
    }

}











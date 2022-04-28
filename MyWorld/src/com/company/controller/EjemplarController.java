package com.company.controller;

import com.company.model.Ejemplar;

import java.util.HashMap;

public class EjemplarController {
    static HashMap<String, Ejemplar> listsExemplars = new HashMap();

    public static void createEjemplar(String titulo){
        Ejemplar ejemplar = new Ejemplar(titulo);

        listsExemplars.put(ejemplar.getSku(), ejemplar);


        }
    }








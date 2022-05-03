package com.company.controller;

import com.company.model.Ejemplar;
import com.company.model.EjemplarList;

import java.util.HashMap;
import java.util.UUID;

public class EjemplarController {

    static EjemplarList lista = new EjemplarList();

    public static void createEjemplar(String titulo, String author){
            Ejemplar ejemplar = new Ejemplar(titulo, author);
            lista.add(ejemplar);

        }
    }









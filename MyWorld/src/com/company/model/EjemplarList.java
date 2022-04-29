package com.company.model;

import java.util.HashMap;

public class EjemplarList {
    private HashMap<String, Ejemplar> ejemplares;

    public EjemplarList(){
        ejemplares = new HashMap<>();

    }

    public void add (Ejemplar ejemplar){
        ejemplares.put(ejemplar.getSku(), ejemplar);
    }

    @Override
    public String toString(){
        for (Ejemplar ejemplar : ejemplares){

        }
        return
    }





}



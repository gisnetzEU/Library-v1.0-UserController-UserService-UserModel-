package com.company.model;

import java.util.HashMap;

public class LendingMap {

    private HashMap<String, Lending> lendingList;

    public LendingMap(HashMap<String, Lending> lendingList) {
        this.lendingList = lendingList;
    }

    public LendingMap() {
        this.lendingList = new HashMap<>();
    }

    public HashMap<String, Lending> getLendingList() {
        return lendingList;
    }

    public void setLendingList(HashMap<String, Lending> lendingList) {
        this.lendingList = lendingList;
    }

    @Override
    public String toString() {
        return "LendingMap{" +
                "lendingList=" + lendingList +
                '}';
    }
}

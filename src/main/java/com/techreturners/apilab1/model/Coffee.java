package com.techreturners.apilab1.model;

public class Coffee {
    private final long id;
    private final String name;
    private int counter;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coffee(long id, String name) {
        this.id = id;
        this.name = name;
    }



}

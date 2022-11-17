package com.somkiat.day2_tx.demo;

public class UserResponse {
    private int id;
    private String name;

    public UserResponse() {
    }

    public UserResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

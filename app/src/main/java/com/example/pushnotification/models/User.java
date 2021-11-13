package com.example.pushnotification.models;

public class User {
    String Token;

    public User(String token) {
        Token = token;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}

package com.example.summer.user;

public class User {
    private String id;
    private String pw;
    private String name;
    private String email;

    User(String id, String pw, String name) {
        this.name = name;
        this.id = id;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    public String getId() {
        return id;
    }
}

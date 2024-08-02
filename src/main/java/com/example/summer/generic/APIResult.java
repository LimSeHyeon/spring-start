package com.example.summer.generic;

public class APIResult<T> {
    private boolean success;
    private String response;
    private T message;

    public APIResult(boolean success, String response, T message) {
        this.success = success;
        this.response = response;
        this.message = message;
    }

}

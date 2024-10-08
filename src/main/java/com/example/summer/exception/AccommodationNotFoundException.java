package com.example.summer.exception;

import com.example.summer.accommodation.Accommodation;

import java.util.NoSuchElementException;

public class AccommodationNotFoundException extends NoSuchElementException {
    private String message;

    public AccommodationNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

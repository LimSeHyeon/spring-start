package com.example.summer.trip;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TripRepository {

    HashMap<Integer, String> trip_table = new HashMap<>();

    TripRepository() {

    }

    public String getProduct() {
        return "파라스파라 서울";
    }

    public boolean saveProduct(String name) {
        try {
            trip_table.put(trip_table.size()+1, name);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}

package com.example.summer.trip;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TripRepository {

    HashMap<Integer, String> tripTable = new HashMap<>();
    int idx = 0;

    TripRepository() {

    }

    public String findProduct(int id) {
        System.out.println(tripTable.get(id));
        return tripTable.get(id);
    }

    public String saveProduct(String name) {
        tripTable.put(idx++, name);
        return tripTable.get(idx-1);

    }
}

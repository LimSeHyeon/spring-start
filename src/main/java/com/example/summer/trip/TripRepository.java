package com.example.summer.trip;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TripRepository {

    HashMap<Integer, Hotel> tripTable = new HashMap<>();
    int idx = 0;

    TripRepository() {

    }

    public Hotel findProduct(int id) {
        System.out.println(tripTable.get(id));
        return tripTable.get(id);
    }

    public Hotel saveProduct(Hotel hotel) {
        tripTable.put(idx++, hotel);
        return tripTable.get(idx-1);

    }
}

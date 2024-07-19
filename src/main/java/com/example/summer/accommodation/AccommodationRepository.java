package com.example.summer.accommodation;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class AccommodationRepository {

    HashMap<Integer, Accommodation> tripTable = new HashMap<>();
    int idx = 0;

    AccommodationRepository() {

    }

    public Accommodation findProduct(int id) {
        System.out.println(tripTable.get(id));
        return tripTable.get(id);
    }

    public Accommodation saveProduct(Accommodation accommodation) {
        tripTable.put(idx++, accommodation);
        return tripTable.get(idx-1);

    }
}

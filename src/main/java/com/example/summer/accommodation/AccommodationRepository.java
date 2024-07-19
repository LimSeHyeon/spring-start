package com.example.summer.accommodation;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class AccommodationRepository {

    HashMap<Integer, Accommodation> bbashaTable = new HashMap<>();
    int idx = 0;

    AccommodationRepository() {

    }

    public Accommodation findProduct(int id) {
        System.out.println(bbashaTable.get(id));
        return bbashaTable.get(id);
    }

    public Accommodation saveProduct(Accommodation accommodation) {
        bbashaTable.put(idx++, accommodation);
        return bbashaTable.get(idx-1);
    }
}

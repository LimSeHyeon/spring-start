package com.example.summer.accommodation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public List<Accommodation> findAll() {
        return new ArrayList<>(bbashaTable.values());

    }

    public Accommodation saveProduct(Accommodation accommodation) {
        bbashaTable.put(idx++, accommodation);
        return bbashaTable.get(idx-1);
    }
}

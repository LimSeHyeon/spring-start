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
        if(bbashaTable.get(id) == null)
            return bbashaTable.get(id);
        else
            return null;
    }

    public List<Accommodation> findAll() {
        return new ArrayList<>(bbashaTable.values());

    }

    public Accommodation saveProduct(Accommodation accommodation) {
        bbashaTable.put(idx++, accommodation);
        return bbashaTable.get(idx-1);
    }
}

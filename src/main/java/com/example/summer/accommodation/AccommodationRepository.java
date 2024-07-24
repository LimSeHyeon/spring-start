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

    public String getAccommodation(int id) {
        Accommodation foundAccommodation = bbashaTable.get(id);
        try {
            return foundAccommodation.getName();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "exception";
        }
    }

    public List<Accommodation> findAll() {
        return new ArrayList<>(bbashaTable.values());

    }

    public Accommodation saveProduct(Accommodation accommodation) {
        bbashaTable.put(idx++, accommodation);
        return bbashaTable.get(idx-1);
    }
}

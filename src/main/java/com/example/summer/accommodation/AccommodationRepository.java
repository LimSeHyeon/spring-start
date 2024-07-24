package com.example.summer.accommodation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class AccommodationRepository {

    HashMap<Integer, Accommodation> bbashaTable = new HashMap<>();
    int idx = 0;

    AccommodationRepository() {

    }

    public Accommodation getAccommodation(int id) throws NoSuchElementException {
        Accommodation foundAccommodation = bbashaTable.get(id);
            if (foundAccommodation != null)
                return bbashaTable.get(id);
            else
                throw new NoSuchElementException("no room!");

    }

    public List<Accommodation> findAll() {
        return new ArrayList<>(bbashaTable.values());

    }

    public Accommodation saveProduct(Accommodation accommodation) {
        bbashaTable.put(idx++, accommodation);
        return bbashaTable.get(idx-1);
    }
}

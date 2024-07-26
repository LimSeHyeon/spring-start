package com.example.summer.accommodation;

import com.example.summer.exception.AccommodationNotFoundException;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class AccommodationRepository {

    @Autowired
    DataSource dataSource;

    HashMap<Integer, Accommodation> bbashaTable = new HashMap<>();
    int idx = 0;
    EntityManager entityManager;

    AccommodationRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void makeConnection() {
        System.out.println(DataSourceUtils.getConnection(dataSource));
    }

    public Accommodation getAccommodation(int id) throws NoSuchElementException {
        Accommodation foundAccommodation = bbashaTable.get(id);
            if (foundAccommodation != null)
                return bbashaTable.get(id);
            else
                throw new AccommodationNotFoundException("no room!");

    }

    public List<Accommodation> findAll() {
        return new ArrayList<>(bbashaTable.values());

    }

    public Accommodation saveProduct(Accommodation accommodation) {
        bbashaTable.put(idx++, accommodation);
        return bbashaTable.get(idx-1);
    }
}

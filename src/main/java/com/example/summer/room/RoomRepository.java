package com.example.summer.room;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.HashMap;

@Component
public class RoomRepository {


    HashMap<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;

    EntityManager entityManager;

    @Autowired
    RoomRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveRoom(Room room) {
        entityManager.persist(room);
    }


    public Room findRoom(int id) {
        Room room = roomTable.get(id);
        return room;
    }


}

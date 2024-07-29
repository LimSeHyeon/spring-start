package com.example.summer.room;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class RoomJPARepository implements RoomRepository {


    HashMap<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;

    EntityManager entityManager;

    @Autowired
    RoomJPARepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveRoom(Room room) {
        entityManager.persist(room);
    }


    public Room findRoom(int id) {
        return entityManager.find(Room.class, id);
    }


    @Override
    public Room save() {
        return null;
    }
}

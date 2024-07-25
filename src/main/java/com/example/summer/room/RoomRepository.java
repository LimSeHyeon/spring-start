package com.example.summer.room;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class RoomRepository {

    HashMap<Integer, Room> roomTable = new HashMap<>();
    int idx = 0;

    RoomRepository(){}

    public Room findRoom(int id) {
        Room room = roomTable.get(id);
        return room;
    }


}

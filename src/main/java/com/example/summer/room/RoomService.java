package com.example.summer.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Transactional
    public void saveRoom(Room room) {
        roomRepository.saveRoom(room);
    }


    public Room getRoom(int id) {
        return roomRepository.findRoom(id);
    }
}

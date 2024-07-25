package com.example.summer.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

//    RoomService(RoomRepository roomRepository) {
//        this.roomRepository = roomRepository;
//    }

    public Room getRoom(int id) {
        return roomRepository.findRoom(id);
    }
}

package com.example.summer.room;

import com.example.summer.room.dto.RoomRegisterReq;
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
    public void saveRoom(RoomRegisterReq roomRegisterReq) {
        Room room = new Room(roomRegisterReq.getType(), roomRegisterReq.getPrice());
        roomRepository.saveRoom(room);
    }

    @Transactional
    public Room getRoom(int id) {
        return roomRepository.findRoom(id);
    }
}

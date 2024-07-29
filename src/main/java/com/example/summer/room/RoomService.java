package com.example.summer.room;

import com.example.summer.room.dto.RoomRegisterReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoomService {

    private RoomJPARepository roomJPARepository;

    @Autowired
    RoomService(RoomJPARepository roomJPARepository) {
        this.roomJPARepository = roomJPARepository;
    }

    @Transactional
    public void saveRoom(RoomRegisterReq roomRegisterReq) {
        roomJPARepository.saveRoom(roomRegisterReq.toEntity());
    }

    @Transactional
    public Room getRoom(int id) {
        return roomJPARepository.findRoom(id);
    }
}

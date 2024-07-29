package com.example.summer.room;

import com.example.summer.room.dto.RoomRegisterReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    RoomService(RoomJPARepository roomJPARepository) {
        this.roomRepository = roomJPARepository;
    }

//    @Transactional
//    public void saveRoom(RoomRegisterReq roomRegisterReq) {
//        roomRepository.save(roomRegisterReq.toEntity());
//    }
//
//    @Transactional
//    public Room getRoom(int id) {
//        return roomRepository.findRoom(id);
//    }
}

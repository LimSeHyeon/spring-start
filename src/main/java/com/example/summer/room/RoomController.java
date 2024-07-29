package com.example.summer.room;

import com.example.summer.room.dto.RoomRegisterReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomController {
    RoomService roomService;
    RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @RequestMapping(value="/rooms/{id}", method = RequestMethod.GET)
    public ResponseEntity<Room> getRoom(@PathVariable(value="id") int id) {
        Room foundRoom = roomService.getRoom(id);
        return new ResponseEntity<>(foundRoom, HttpStatus.OK);
    }

    @PostMapping("/rooms")
    public void saveRoom(@RequestBody RoomRegisterReq roomRegisterReq) {
        roomService.saveRoom(roomRegisterReq);
    }
}

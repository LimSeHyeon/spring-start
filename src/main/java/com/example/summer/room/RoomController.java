package com.example.summer.room;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}

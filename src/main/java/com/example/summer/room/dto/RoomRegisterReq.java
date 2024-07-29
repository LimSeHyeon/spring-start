package com.example.summer.room.dto;

import com.example.summer.room.Room;

public class RoomRegisterReq {
    private String type;
    private int price;

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Room toEntity() {
        return new Room(type, price);
    }

}

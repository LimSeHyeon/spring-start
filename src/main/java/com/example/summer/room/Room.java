package com.example.summer.room;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;
    private int accommodationId;
    private String type;
    private int price;

    Room(){}

    public Room(String type, int price) {
        this.type = type;
        this.price = price;
    }

    Room(String type, int price, int accommodationId, int roodId) {
        this.type = type;
        this.price = price;
        this.accommodationId = accommodationId;
        this.roomId = roodId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(int accommodationId) {
        this.accommodationId = accommodationId;
    }
}

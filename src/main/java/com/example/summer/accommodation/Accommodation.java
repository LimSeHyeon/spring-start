package com.example.summer.accommodation;

import java.util.ArrayList;

public class Accommodation {
    private int id;
    private String name;
    private int lowPrice;
    private ArrayList<Room> rooms;

    Accommodation(String name, int lowPrice) {
        this.name = name;
        this.lowPrice = lowPrice;
    }

    Accommodation() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(int lowPrice) {
        this.lowPrice = lowPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}

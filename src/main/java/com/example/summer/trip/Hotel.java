package com.example.summer.trip;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private int lowPrice;

    Hotel(String name, int lowPrice) {
        this.name = name;
        this.lowPrice = lowPrice;
    }


    public String getName() {
        return name;
    }

    public int getLowPrice() {
        return lowPrice;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setLowPrice(int lowPrice) {
//        this.lowPrice = lowPrice;
//    }
    //    private ArrayList<Room> rooms;

}

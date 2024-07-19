package com.example.summer.accommodation;

public class Accommodation {
    private int id;
    private String name;
    private int lowPrice;

    Accommodation(String name, int lowPrice) {
        this.name = name;
        this.lowPrice = lowPrice;
    }

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
}

package com.example.summer.generic;

public class Box {

    String str;

    public void put(String str) {
        this.str = str;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box strBox = new Box();
        strBox.put("하하하");

        Box intBox = new Box();
        intBox.put(1);
    }
}
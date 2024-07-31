package com.example.summer.generic;

public class Box<T> {

    T object;

    public void put(T object) {
        this.object = object;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.put("하하하");

        Box<Integer> intBox = new Box<>();
        intBox.put(1);
    }
}
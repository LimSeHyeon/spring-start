package com.example.summer.core;

//import org.springframework.stereotype.Component;
//
//@Component
public class House {
    private String name;
    House() {
        this.name = "B House";
        System.out.println("Created House Bean!");
    }

    public String getName() {
        return name;
    }
}

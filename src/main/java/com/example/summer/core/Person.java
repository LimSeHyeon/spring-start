package com.example.summer.core;

//import org.springframework.stereotype.Component;
//
//@Component
public class Person {
    House house;

//    @Autowired
    Person (House house) {
        this.house = house;
        System.out.println("buy " + house.getName());
    }

}

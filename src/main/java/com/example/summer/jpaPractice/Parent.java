package com.example.summer.jpaPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Parent {
    @Id
    String id;
    String name;
}

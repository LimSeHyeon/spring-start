package com.example.summer.jpaPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Child {
    @Id
    private int id;
    private String name;
    @ManyToOne
//    @JoinColumn("parent_id")
    private Parent parent;
}

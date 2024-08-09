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
    @JoinColumn(name="parent_id")
    private Parent parent;

    public Child(int id, String name, Parent parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    public Child() {}
}

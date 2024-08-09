package com.example.summer.jpaPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Parent {
    @Id
    String id;
    String name;

    public Parent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Q. 기본 생성자가 필요한 이유? : JPA가 reflection을 위해 필요로 해요
    public Parent() {}
}

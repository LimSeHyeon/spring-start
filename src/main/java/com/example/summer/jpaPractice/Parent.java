package com.example.summer.jpaPractice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import org.springframework.data.repository.cdi.Eager;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Parent {
    @Id
    String id;
    String name;
    @OneToMany(mappedBy = "parent", fetch= FetchType.EAGER)
    @JsonIgnoreProperties({"parent"})
    List<Child> children;

    public Parent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Q. 기본 생성자가 필요한 이유? : JPA가 reflection을 위해 필요로 해요
    public Parent() {}
}

package com.example.summer.jpaPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildController {
    ParentService parentService;
    ChildService childService;

    public ChildController(ParentService parentService, ChildService childService) {
        this.parentService = parentService;
        this.childService = childService;

    }

    @PostMapping(value="/child")
    public void saveChild() {
        Parent parent = new Parent("parent1", "parent1");
        parentService.save(parent);

        Child child = new Child(1, "child1", parent);
        childService.save(child);
    }

    @GetMapping("/child")
    public Child findChild() {
        return childService.findChild(1);
    }
}


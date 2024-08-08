package com.example.summer.jpaPractice;

import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class FamilyController {
//    FamilyService familyService;
//
//    public FamilyController(FamilyService familyService) {
//        this.familyService = familyService;
//    }
//
//    @PostMapping(value="/child")
//    public void saveChild() {
//        Parent parent = new Parent("parent1", "parent1");
//        parentService.save(parent)
//    }
//}

@RestController
public class FamilyController {
    @GetMapping("/hkhk")
    public void test() {
        System.out.println("hishi");
    }
}

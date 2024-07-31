package com.example.summer.carrot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrotController {

    private final int MEMBER = 1;

    private CarrotMemberService carrotMemberService;
    private CarrotNotMemberService carrotNotMemberService;

    CarrotController(CarrotMemberService carrotMemberService, CarrotNotMemberService carrotNotMemberService) {
        this.carrotMemberService = carrotMemberService;
        this.carrotNotMemberService = carrotNotMemberService;
    }

    @GetMapping("/carrot/{id}")
    public int calcDiscountedPrice(@PathVariable int id) {
        if(isMember(id)) {
            return carrotMemberService.calcDiscountedPrice();
        } else {
            return carrotNotMemberService.calcDiscountedPrice();
        }
    }

    private boolean isMember(int id) {
        return id == MEMBER;
    }
}

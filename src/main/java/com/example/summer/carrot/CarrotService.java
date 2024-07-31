package com.example.summer.carrot;

import org.springframework.stereotype.Component;

public class CarrotService {

    DiscountPolicy discountPolicy;

    public int calcDiscountedPrice() {
        return discountPolicy.getPolicy();
    }
}

@Component
class CarrotMemberService extends CarrotService {

    CarrotMemberService(DiscountMemberPolicy discountMemberPolicy) {
        this.discountPolicy = discountMemberPolicy;
    }
}

@Component
class CarrotNotMemberService extends CarrotService {

    public CarrotNotMemberService(DiscountNotMemberPolicy discountNotMemberPolicy) {
        this.discountPolicy = discountNotMemberPolicy;
    }
}
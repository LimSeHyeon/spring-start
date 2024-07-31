package com.example.summer.carrot;

import org.springframework.stereotype.Component;

public interface CarrotService {

    DiscountPolicy discountPolicy;

    public int calcDiscountedPrice() {
        return discountPolicy.getPolicy();
    }
}

@Component
class CarrotMemberService implements CarrotService {

    CarrotMemberService(DiscountMemberPolicy discountMemberPolicy) {
        this.discountPolicy = discountMemberPolicy;
    }
}

@Component
class CarrotNotMemberService implements CarrotService {

    public CarrotNotMemberService(DiscountNotMemberPolicy discountNotMemberPolicy) {
        this.discountPolicy = discountNotMemberPolicy;
    }
}
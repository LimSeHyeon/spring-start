package com.example.summer.carrot;

import org.springframework.stereotype.Component;

public class CarrotService {

    DiscountPolicy discountPolicy;

    public CarrotService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public int calcDiscountedPrice() {
        return discountPolicy.getPolicy();
    }
}

@Component
class CarrotMemberService extends CarrotService {

    CarrotMemberService(DiscountPolicy discountPolicy) {
        super(discountPolicy);
    }
}

@Component
class CarrotNotMemberService extends CarrotService {

    public CarrotNotMemberService(DiscountPolicy discountPolicy) {
        super(discountPolicy);
    }
}
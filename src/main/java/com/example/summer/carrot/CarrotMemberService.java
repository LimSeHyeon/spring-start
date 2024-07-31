package com.example.summer.carrot;

import org.springframework.stereotype.Component;

@Component
public class CarrotMemberService {

    DiscountMemberPolicy discountMemberPolicy;

    CarrotMemberService(DiscountMemberPolicy discountMemberPolicy) {
        this.discountMemberPolicy = discountMemberPolicy;
    }

    public int calcDiscountedPrice() {
        return discountMemberPolicy.getPolicy();
    }
}

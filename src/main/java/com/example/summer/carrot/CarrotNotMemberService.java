package com.example.summer.carrot;

import org.springframework.stereotype.Component;

@Component
public class CarrotNotMemberService {

    DiscountNotMemberPolicy discountNotMemberPolicy;

    public CarrotNotMemberService(DiscountNotMemberPolicy discountNotMemberPolicy) {
        this.discountNotMemberPolicy = discountNotMemberPolicy;
    }

    public int calcDiscountedPrice() {
        return discountNotMemberPolicy.getPolicy();
    }
}

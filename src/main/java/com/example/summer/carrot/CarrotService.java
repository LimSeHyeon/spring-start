package com.example.summer.carrot;

import org.springframework.stereotype.Component;

public interface CarrotService {
    int calcDiscountedPrice();
}

@Component
class CarrotMemberService {

    DiscountMemberPolicy discountMemberPolicy;

    CarrotMemberService(DiscountMemberPolicy discountMemberPolicy) {
        this.discountMemberPolicy = discountMemberPolicy;
    }

    public int calcDiscountedPrice() {
        return discountMemberPolicy.getPolicy();
    }
}

@Component
class CarrotNotMemberService {

    DiscountNotMemberPolicy discountNotMemberPolicy;

    public CarrotNotMemberService(DiscountNotMemberPolicy discountNotMemberPolicy) {
        this.discountNotMemberPolicy = discountNotMemberPolicy;
    }

    public int calcDiscountedPrice() {
        return discountNotMemberPolicy.getPolicy();
    }
}
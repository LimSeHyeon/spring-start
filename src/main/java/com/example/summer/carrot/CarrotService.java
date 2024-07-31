package com.example.summer.carrot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class CarrotService {
    /*
    Q. @Primary 가 아닌 DiscountNotMemberPolicy를 쓰고싶다면?
    A1. DiscountMemberPolicy 로 해도 됨 !
    A2. @Qualifier("discountMemberPolicy")
     */

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

    public CarrotNotMemberService(@Qualifier("DiscountNotMemberPolicy") DiscountPolicy discountPolicy) {
        super(discountPolicy);
    }
}
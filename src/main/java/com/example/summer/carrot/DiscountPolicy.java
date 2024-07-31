package com.example.summer.carrot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
껍데기만 같던데?
Service에서 다르게 하기
 */

public interface DiscountPolicy {
    int getPolicy();
}

@Primary
@Component
class DiscountMemberPolicy implements DiscountPolicy {
    public int getPolicy() {
        return 1;
    }
}

@Qualifier("DiscountNotMemberPolicy")
@Component
class DiscountNotMemberPolicy implements DiscountPolicy {

    public int getPolicy() {
        return 0;
    }
}
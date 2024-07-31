package com.example.summer.carrot;

import org.springframework.stereotype.Component;

@Component
public class DiscountNotMemberPolicy {

    public int getPolicy() {
        return 0;
    }
}

package com.example.summer.accommodation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Accommodation {
    private String name;
    private int lowPrice;

    Accommodation(String name, int lowPrice) {
        this.name = name;
        this.lowPrice = lowPrice;
    }

}

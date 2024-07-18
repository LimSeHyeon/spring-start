package com.example.summer.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripService {
    TripRepository tripRepository;

    @Autowired
    TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public String getProduct() {
        return tripRepository.getProduct();
    }

    public String addProduct(String name) {
        boolean result = tripRepository.saveProduct(name);
        if(result) return name + " 상품 생성 성공 !";
        else return "상품 생성 실패";
    }
}

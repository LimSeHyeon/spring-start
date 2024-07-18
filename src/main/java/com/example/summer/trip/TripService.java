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

    public String getProduct(int id) {
        return tripRepository.findProduct(id);
    }

    public String addProduct(String name) {
        String result = tripRepository.saveProduct(name);
        return result + " 상품 생성 성공 !";
    }
}

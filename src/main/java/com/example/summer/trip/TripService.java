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
}

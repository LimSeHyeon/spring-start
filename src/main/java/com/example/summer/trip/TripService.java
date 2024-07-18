package com.example.summer.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TripService {
    TripRepository tripRepository;

    @Autowired
    TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Hotel getProduct(int id) {
        return tripRepository.findProduct(id);
    }

    public Hotel addProduct(Hotel hotel) {
        return tripRepository.saveProduct(hotel);
    }
}

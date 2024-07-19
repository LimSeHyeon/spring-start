package com.example.summer.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TripController {

    TripService tripService;
    @Autowired // 스프링아, 매개변수 '타입'에 맞는 적절한 객체 좀 넣어 줘
    TripController(TripService tripService) {
        this.tripService = tripService;
    }


    @RequestMapping(value="/products/{id}", method = RequestMethod.GET)
    public Hotel getProduct(@PathVariable(value="id") int id) {
        return tripService.getProduct(id);
    }

    @RequestMapping(value="/products", method = RequestMethod.POST)
    public Hotel addProduct(@RequestBody Hotel hotel) {
        return tripService.addProduct(hotel);
    }
}




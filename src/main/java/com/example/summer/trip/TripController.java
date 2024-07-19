package com.example.summer.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TripController {

    TripService tripService;
    @Autowired
    TripController(TripService tripService) {
        this.tripService = tripService;
    }


    @RequestMapping(value="/products/{id}", method = RequestMethod.GET)
    public Hotel getAccomodationName(@PathVariable(value="id") int id) {
        return tripService.getAccomodationName(id);
    }

    @RequestMapping(value="/products", method = RequestMethod.POST)
    public Hotel addAccomodation(@RequestBody Hotel hotel) {
        return tripService.addAccomodation(hotel);
    }
}




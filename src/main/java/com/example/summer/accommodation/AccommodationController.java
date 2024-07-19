package com.example.summer.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccommodationController {

    AccommodationService accommodationService;
    @Autowired
    AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }


    @RequestMapping(value="/products/{id}", method = RequestMethod.GET)
    public Accommodation getAccomodationName(@PathVariable(value="id") int id) {
        return accommodationService.getAccomodationName(id);
    }

    @RequestMapping(value="/products", method = RequestMethod.POST)
    public Accommodation addAccomodation(@RequestBody Accommodation accommodation) {
        return accommodationService.addAccomodation(accommodation);
    }
}




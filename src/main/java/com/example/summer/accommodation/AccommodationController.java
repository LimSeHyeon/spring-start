package com.example.summer.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccommodationController {

    AccommodationService accommodationService;
    @Autowired
    AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }


    @RequestMapping(value="/acommodations/{id}", method = RequestMethod.GET)
    public Accommodation getAccomodationName(@PathVariable(value="id") int id) {
        return accommodationService.getAccomodationName(id);
    }

    // 전체 숙소 조회
    @RequestMapping(value="/accommodations", method = RequestMethod.GET)
    public ResponseEntity<List<Accommodation>> getAllAccommodations() {
        List<Accommodation> accommodations = accommodationService.getAll();
        return new ResponseEntity<>(accommodations, HttpStatus.OK);
    }

    //숙소 1개 등록
    @RequestMapping(value="/accommodations", method = RequestMethod.POST)
    public ResponseEntity<Accommodation> addAccomodation(@RequestBody Accommodation accommodation) {
        Accommodation savedAccommodation = accommodationService.addAccomodation(accommodation);
        return new ResponseEntity<>(savedAccommodation, HttpStatus.CREATED);
    }

    //방 한 개 등록
//    @RequestMapping(value = "/rooms", method = RequestMethod.POST)
//    public ResponseEntity<Room> addRoom(@RequestBody Room room) {
//        System.out.println(room.getPrice()+room.getType());
//        return new ResponseEntity<>()
//    }
}




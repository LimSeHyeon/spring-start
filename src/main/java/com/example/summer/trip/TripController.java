package com.example.summer.trip;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {
    TripService tripService = new TripService();

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test() {
        return "sehseh";
    }

    /*
    localhost:8080/product/, GET
    */
    @RequestMapping(value="/product", method = RequestMethod.GET)
    public String test2() {
        String result = tripService.getProduct();
        return result;
    }

    /*
    localhost:8080/______, ___
    pah variable로 숫자 -> 화면에 떴ㅇ면 !
     */

    @RequestMapping(value="/products/{id}", method = RequestMethod.GET)
    public String printID(@PathVariable(value="id") int id) {
        return id + "";
    }
}




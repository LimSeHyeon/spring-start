package com.example.summer.carrotmarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarrotController {

    CarrotService carrotService;

    @Autowired
    CarrotController(CarrotService carrotService) {
        this.carrotService = carrotService;
    }

    @RequestMapping(value = "/cost", method = RequestMethod.POST)
    public ResponseEntity<Integer> getCost(@RequestBody CarrotCostReq carrotCostReq) {
        System.out.println(carrotCostReq.getIsUser());
        double doubleCost = carrotService.getCost(carrotCostReq);
        return new ResponseEntity<>((int)doubleCost, HttpStatus.OK);
    }

}

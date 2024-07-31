package com.example.summer.carrotmarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarrotMarketController {

    CarrotMarketService carrotMarketService;

    @Autowired
    CarrotMarketController(CarrotMarketService carrotMarketService) {
        this.carrotMarketService = carrotMarketService;
    }

    @RequestMapping(value = "/cost", method = RequestMethod.POST)
    public ResponseEntity<Integer> getCost(@RequestBody CarrotCostReq carrotCostReq) {
        System.out.println(carrotCostReq.getIsUser());
        double doubleCost = carrotMarketService.getCost(carrotCostReq);
        return new ResponseEntity<>((int)doubleCost, HttpStatus.OK);
    }

}

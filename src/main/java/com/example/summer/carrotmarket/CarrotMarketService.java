package com.example.summer.carrotmarket;

import org.springframework.stereotype.Component;

@Component
public class CarrotMarketService {
    public double getCost(CarrotCostReq carrotCostReq) {
        int price = carrotCostReq.getPrice();
        if(!carrotCostReq.getIsUser()) {
            if(carrotCostReq.getIsHave()) return 0.9*price;
            else return price;
        }
        else {
            int grade = carrotCostReq.getGrade();
            if(grade>=2) return price*(1-grade*5*0.01);
            else if(carrotCostReq.getIsHave()) return 0.9*price;
            else if(grade==1) return price*0.95;
            else return price;
        }
    }
}

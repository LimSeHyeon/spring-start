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

    /*
    path variable로 idx값을 받아서
    repository에 매핑되어 있는 value(숙소명)dmf 출력해주세요 !
     */

    @RequestMapping(value="/products/{id}", method = RequestMethod.GET)
    public String getProduct(@PathVariable(value="id") int id) {
        return tripService.getProduct(id);
    }
    /*
    쿼리 파라미터(스트링)로 숙소명을 받아서
    repository table에 저장한 뒤,
    "{숙소명} 상품 생성 성공!"
     */
    @RequestMapping(value="/products", method = RequestMethod.GET)
    public String addProduct(@RequestParam(value="name") String name) {
        return tripService.addProduct(name);
    }
}




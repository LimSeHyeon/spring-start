package com.example.summer.user;

import com.example.summer.accommodation.Accommodation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/users/signup")
    public UserJoinReq join(@Valid @RequestBody UserJoinReq userJoinReq, Errors errors) {
//        userService.handleErrors(errors);
        for(FieldError fieldError : errors.getFieldErrors()) {
            String errorField = fieldError.getField();;
            System.out.println("errorField : " + errorField);
        }
        return userJoinReq;
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public ResponseEntity<LoginUser> loginUser(@RequestBody User user) {
        LoginUser loginUser = userService.login(user);
        return new ResponseEntity<>(loginUser, HttpStatus.CREATED);
    }
}

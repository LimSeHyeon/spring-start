package com.example.summer.user;

import com.example.summer.accommodation.Accommodation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value="/users/signup", method = RequestMethod.POST)
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        User loginUser = userService.login(user);
        return new ResponseEntity<>(loginUser, HttpStatus.CREATED);
    }
}

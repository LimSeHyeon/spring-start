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

import java.util.Map;


@RestController
public class UserController {

    UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/users/signup")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> join(@Valid @RequestBody UserJoinReq userJoinReq, Errors errors) {
        Map<String, String> errorMessages = userService.handleErrors(errors);

        // Map -> new ApiError(errorMessages)
        return errorMessages;
    }

    @PostMapping(value="/users/signup2")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public UserJoinReq join2(@Valid @RequestBody UserJoinReq userJoinReq) {

        return userJoinReq;
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public ResponseEntity<LoginUser> loginUser(@RequestBody User user) {
        LoginUser loginUser = userService.login(user);
        return new ResponseEntity<>(loginUser, HttpStatus.CREATED);
    }
}

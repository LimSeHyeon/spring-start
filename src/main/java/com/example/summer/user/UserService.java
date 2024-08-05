package com.example.summer.user;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserService {

    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Map<String, String> handleErrors(Errors errors) {
        Map<String, String> errorMessages = new HashMap<>();

        for(FieldError fieldError : errors.getFieldErrors()) {
            String errorField = fieldError.getField();
            String errorMessage = fieldError.getDefaultMessage();

            errorMessages.put(errorField, errorMessage);
        }
        return errorMessages;
    }

    public User addUser(User user) {
        return userRepository.saveUser(user);
    }

    public LoginUser login(User user) {
        User checkedUser = userRepository.getUser(user);
        return new LoginUser(checkedUser.getName(), checkedUser.getId());
    }
}

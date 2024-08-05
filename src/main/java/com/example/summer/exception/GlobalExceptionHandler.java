package com.example.summer.exception;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
//    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler);

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidatonException(MethodArgumentNotValidException errors) {
        Map<String, String> errorMessages = new HashMap<>();

        for(FieldError fieldError : errors.getFieldErrors()) {
            String errorField = fieldError.getField();
            String errorMessage = fieldError.getDefaultMessage();

            errorMessages.put(errorField, errorMessage);
        }
        return errorMessages;
    }


    @ExceptionHandler(value = AccommodationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String catchAccommodatonNotFoundException(AccommodationNotFoundException e) {
        log.error("exception class : {}", e.getClass());
        return "No Room!!";
    }
}

package com.example.summer.exception;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
//    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler);

    @ExceptionHandler(value = AccommodationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String catchAccommodatonNotFoundException(AccommodationNotFoundException e) {
        log.error("exception class : {}", e.getClass());
        return "No Room!!";
    }
}

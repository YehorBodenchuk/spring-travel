package com.travel.controllers;

import com.travel.exceptions.UserBadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler({UserBadRequestException.class})
    public ResponseEntity<?> handleValidationException(UserBadRequestException userBadRequestException) {
        return ResponseEntity.status(400).body(userBadRequestException.getMessage());
    }
}

package com.makershark.SearchSupplier.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NoManufacturerFoundException.class)
    public ResponseEntity handleNoManufacturerFoundException(){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}

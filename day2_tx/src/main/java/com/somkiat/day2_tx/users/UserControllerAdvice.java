package com.somkiat.day2_tx.users;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Error> doWithError(BusinessException e){
        Error error = new Error();
        error.setCode(e.id);
        error.setMessage("User id="+ e.id + " not found");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}

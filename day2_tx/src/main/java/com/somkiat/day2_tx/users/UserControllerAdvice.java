package com.somkiat.day2_tx.users;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public Error doWithError(BusinessException e){
        Error error = new Error();
        error.setCode(e.id);
        error.setMessage("User id="+ e.id + " not found");
        return error;
    }

}

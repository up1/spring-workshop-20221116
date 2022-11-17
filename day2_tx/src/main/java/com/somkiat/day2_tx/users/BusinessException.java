package com.somkiat.day2_tx.users;

public class BusinessException extends RuntimeException {
    public int id;
    public BusinessException(int id) {
        super();
        this.id = id;
    }
}

package com.petzzz.app.core.error.exceptions;

public class BaseException extends Exception {
    private Integer exceptionStatusCode;
    public BaseException(String message, Integer exceptionStatusCode) {
        super(message);
        this.exceptionStatusCode = exceptionStatusCode;
    }
}

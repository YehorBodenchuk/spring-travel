package com.travel.exceptions;

public class AbstractControllerException extends RuntimeException {

    public AbstractControllerException(String exceptionMessage) {
        super(exceptionMessage);
    }
}

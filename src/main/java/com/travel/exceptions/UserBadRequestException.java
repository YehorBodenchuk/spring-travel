package com.travel.exceptions;

public class UserBadRequestException extends AbstractControllerException {

    public UserBadRequestException(String exceptionMessage) {
        super(exceptionMessage);
    }
}

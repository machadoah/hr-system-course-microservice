package com.medium.machadoah.userapi.services.exceptions;

import lombok.AllArgsConstructor;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }
}

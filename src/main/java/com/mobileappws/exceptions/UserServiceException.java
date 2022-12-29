package com.mobileappws.exceptions;

import java.io.Serial;

public class UserServiceException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 3049683986355l;

    public UserServiceException(String message) {
        super(message);
    }
}

package com.allarchi.allarchiproject.model.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConstructionException extends Exception {
    public ConstructionException(String message) {
        super(message);
    }

    public ConstructionException(Throwable cause) {
        super(cause);
    }
    public ConstructionException(String message,Throwable cause) {
        super(message, cause);
    }

    public ConstructionException(String message,Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

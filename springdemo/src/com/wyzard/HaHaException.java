package com.wyzard;

public class HaHaException extends RuntimeException {
    public HaHaException() {
    }
    public HaHaException(String message, Throwable cause) {
        super(message, cause);
    }

    public HaHaException(String cause) {
        super(cause);
    }

    public HaHaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

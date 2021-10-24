package ru.dataart.academy.java.Exceptions;

public class OutOfIntException extends RuntimeException{
    public OutOfIntException() {
    }

    public OutOfIntException(String message) {
        super(message);
    }

    public OutOfIntException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfIntException(Throwable cause) {
        super(cause);
    }

    public OutOfIntException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

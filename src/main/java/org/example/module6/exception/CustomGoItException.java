package org.example.module6.exception;

public class CustomGoItException extends RuntimeException {
    public CustomGoItException() {
    }

    public CustomGoItException(String message) {
        super(message);
    }
}

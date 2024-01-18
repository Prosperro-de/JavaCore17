package org.example.module7.regexp.bank;

public class RegistrationValidationException extends RuntimeException{
    public RegistrationValidationException() {
    }

    public RegistrationValidationException(String message) {
        super(message);
    }
}

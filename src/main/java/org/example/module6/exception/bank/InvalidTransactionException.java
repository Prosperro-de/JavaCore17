package org.example.module6.exception.bank;

public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException() {
    }

    public InvalidTransactionException(String message) {
        super(message);
    }
}

package com.piseth.templatemethod.exception;

public class UnsupportedPaymentTypeException extends RuntimeException {
    public UnsupportedPaymentTypeException(String message) {
        super(message);
    }
}

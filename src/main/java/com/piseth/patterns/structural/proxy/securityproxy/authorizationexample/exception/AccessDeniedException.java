package com.piseth.patterns.structural.proxy.securityproxy.authorizationexample.exception;

public class AccessDeniedException extends RuntimeException {
    public AccessDeniedException(String message) {
        super(message);
    }
}

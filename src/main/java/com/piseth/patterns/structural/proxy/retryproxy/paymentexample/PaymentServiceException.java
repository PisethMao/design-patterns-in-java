package com.piseth.patterns.structural.proxy.retryproxy.paymentexample;

public class PaymentServiceException extends RuntimeException {
    public PaymentServiceException(String message) {
        super(message);
    }
}

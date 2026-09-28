package com.piseth.templatemethod.processor;

import com.piseth.templatemethod.dto.PaymentRequest;
import com.piseth.templatemethod.dto.PaymentResponse;
import com.piseth.templatemethod.enums.PaymentType;

import java.math.BigDecimal;
import java.time.Instant;

public abstract class PaymentProcessor {
    public final PaymentResponse process(PaymentRequest request) {
        validate(request);
        beforePayment(request);
        BigDecimal fee = calculateFee(request);
        String transactionId = executePayment(request, fee);
        afterPayment(request, transactionId);
        return buildResponse(request, fee, transactionId);
    }

    protected void validate(PaymentRequest request) {
        if (request.amount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than zero");
        }
        IO.println("[VALIDATION] Payment validated");
    }

    protected void beforePayment(PaymentRequest request) {
        IO.println("[PAYMENT] Preparing payment...");
    }

    protected abstract BigDecimal calculateFee(PaymentRequest request);

    protected abstract String executePayment(PaymentRequest request, BigDecimal fee);

    protected void afterPayment(PaymentRequest request, String transactionId) {
        IO.println("[PAYMENT] Payment completed: " + transactionId);
    }

    protected PaymentResponse buildResponse(PaymentRequest request, BigDecimal fee, String transactionId) {
        BigDecimal totalAmount = request.amount().add(fee);
        return new PaymentResponse(
                transactionId,
                request.type(),
                request.amount(),
                fee,
                totalAmount,
                "SUCCESS",
                Instant.now()
        );
    }

    public abstract PaymentType getType();
}

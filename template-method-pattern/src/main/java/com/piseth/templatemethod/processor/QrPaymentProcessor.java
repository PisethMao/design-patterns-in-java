package com.piseth.templatemethod.processor;

import com.piseth.templatemethod.dto.PaymentRequest;
import com.piseth.templatemethod.enums.PaymentType;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class QrPaymentProcessor extends PaymentProcessor {
    @Override
    protected BigDecimal calculateFee(PaymentRequest request) {
        IO.println("[QR] No processing fee");
        return BigDecimal.ZERO;
    }

    @Override
    protected String executePayment(PaymentRequest request, BigDecimal fee) {
        IO.println("[QR] Processing QR payment...");
        return "QR-" + UUID.randomUUID();
    }

    @Override
    public PaymentType getType() {
        return PaymentType.QR;
    }
}
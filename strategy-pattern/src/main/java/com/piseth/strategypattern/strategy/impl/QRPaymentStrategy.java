package com.piseth.strategypattern.strategy.impl;

import com.piseth.strategypattern.domain.PaymentMethod;
import com.piseth.strategypattern.dto.PaymentResponse;
import com.piseth.strategypattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class QRPaymentStrategy implements PaymentStrategy {
    @Override
    public PaymentMethod supportedMethod() {
        return PaymentMethod.QR;
    }

    @Override
    public PaymentResponse pay(BigDecimal amount) {
        IO.println("[QR] Processing QR payment: $" + amount);
        return new PaymentResponse(
                UUID.randomUUID(),
                PaymentMethod.QR,
                amount,
                "QR payment completed successfully"
        );
    }
}
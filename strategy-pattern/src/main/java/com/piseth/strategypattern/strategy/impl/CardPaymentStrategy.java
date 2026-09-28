package com.piseth.strategypattern.strategy.impl;

import com.piseth.strategypattern.domain.PaymentMethod;
import com.piseth.strategypattern.dto.PaymentResponse;
import com.piseth.strategypattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public PaymentMethod supportedMethod() {
        return PaymentMethod.CARD;
    }

    @Override
    public PaymentResponse pay(BigDecimal amount) {
        IO.println("[CARD] Processing card payment: $" + amount);
        return new PaymentResponse(
                UUID.randomUUID(),
                PaymentMethod.CARD,
                amount,
                "Card payment completed successfully"
        );
    }
}
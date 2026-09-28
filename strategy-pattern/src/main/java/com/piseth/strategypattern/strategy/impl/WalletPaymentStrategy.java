package com.piseth.strategypattern.strategy.impl;

import com.piseth.strategypattern.domain.PaymentMethod;
import com.piseth.strategypattern.dto.PaymentResponse;
import com.piseth.strategypattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public PaymentMethod supportedMethod() {
        return PaymentMethod.WALLET;
    }

    @Override
    public PaymentResponse pay(BigDecimal amount) {
        System.out.println("[WALLET] Processing wallet payment: $" + amount);
        return new PaymentResponse(
                UUID.randomUUID(),
                PaymentMethod.WALLET,
                amount,
                "Wallet payment completed successfully"
        );
    }
}
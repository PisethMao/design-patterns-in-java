package com.piseth.strategypattern.strategy;

import com.piseth.strategypattern.domain.PaymentMethod;
import com.piseth.strategypattern.dto.PaymentResponse;

import java.math.BigDecimal;

public interface PaymentStrategy {
    PaymentMethod supportedMethod();

    PaymentResponse pay(BigDecimal amount);
}
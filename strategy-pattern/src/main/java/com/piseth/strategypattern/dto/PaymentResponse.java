package com.piseth.strategypattern.dto;

import com.piseth.strategypattern.domain.PaymentMethod;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentResponse(
        UUID transactionId,
        PaymentMethod method,
        BigDecimal amount,
        String message
) {
}
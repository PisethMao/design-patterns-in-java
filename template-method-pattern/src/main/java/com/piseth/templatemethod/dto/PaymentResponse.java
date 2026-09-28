package com.piseth.templatemethod.dto;

import com.piseth.templatemethod.enums.PaymentType;

import java.math.BigDecimal;
import java.time.Instant;

public record PaymentResponse(
        String transactionId,
        PaymentType paymentType,
        BigDecimal amount,
        BigDecimal fee,
        BigDecimal totalAmount,
        String status,
        Instant processedAt
) {
}

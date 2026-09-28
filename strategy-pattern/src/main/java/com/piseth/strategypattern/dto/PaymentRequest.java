package com.piseth.strategypattern.dto;

import com.piseth.strategypattern.domain.PaymentMethod;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PaymentRequest(
        @NotNull(message = "Payment method is required")
        PaymentMethod method,
        @NotNull(message = "Amount is required")
        @DecimalMin(
                value = "0.01",
                message = "Amount must be greater than 0"
        )
        BigDecimal amount
) {
}
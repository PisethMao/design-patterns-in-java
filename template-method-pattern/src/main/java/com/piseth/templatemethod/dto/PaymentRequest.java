package com.piseth.templatemethod.dto;

import com.piseth.templatemethod.enums.PaymentType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record PaymentRequest(
        @NotNull
        PaymentType type,
        @NotNull
        @DecimalMin("0.01")
        BigDecimal amount,
        @NotNull
        @Positive
        Long customerId
) {
}

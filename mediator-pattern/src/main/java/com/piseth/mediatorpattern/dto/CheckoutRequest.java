package com.piseth.mediatorpattern.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record CheckoutRequest(
        @NotBlank
        String productId,
        @Positive
        int quantity,
        @NotBlank
        @Email
        String customerEmail,
        @NotNull
        @DecimalMin("0.01")
        BigDecimal amount
) {
}

package com.piseth.observerpattern.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record CreateOrderRequest(
        @NotBlank
        String customerName,
        @NotBlank
        @Email
        String customerEmail,
        @NotBlank
        String productName,
        @Min(1)
        int quantity,
        @DecimalMin("0.01")
        BigDecimal unitPrice
) {
}
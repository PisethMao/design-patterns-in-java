package com.piseth.statepattern.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record CreateOrderRequest(
        @NotBlank(message = "Product name is required")
        String productName,
        @Min(
                value = 1,
                message = "Quantity must be at least 1"
        )
        int quantity
) {
}
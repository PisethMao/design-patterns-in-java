package com.piseth.patterns.structural.proxy.cachingproxy.productexample.model;

import java.math.BigDecimal;
import java.util.UUID;

public record Product(
        UUID id,
        String name,
        BigDecimal price
) {
}
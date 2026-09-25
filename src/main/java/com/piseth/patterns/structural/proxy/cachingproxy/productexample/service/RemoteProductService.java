package com.piseth.patterns.structural.proxy.cachingproxy.productexample.service;

import com.piseth.patterns.structural.proxy.cachingproxy.productexample.model.Product;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class RemoteProductService implements ProductService {
    private static final UUID LAPTOP_ID =
            UUID.fromString("11111111-1111-1111-1111-111111111111");
    private static final UUID PHONE_ID =
            UUID.fromString("22222222-2222-2222-2222-222222222222");
    private final Map<UUID, Product> products = Map.of(
            LAPTOP_ID,
            new Product(
                    LAPTOP_ID,
                    "MacBook Pro",
                    BigDecimal.valueOf(1999.99)
            ),
            PHONE_ID,
            new Product(
                    PHONE_ID,
                    "iPhone",
                    BigDecimal.valueOf(999.99)
            )
    );

    @Override
    public Product findById(UUID id) {
        IO.println(
                "[REMOTE SERVICE] Calling remote server for: " + id
        );
        simulateNetworkDelay();
        Product product = products.get(id);
        if (product == null) {
            throw new IllegalArgumentException(
                    "Product not found: " + id
            );
        }
        return product;
    }

    private void simulateNetworkDelay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(
                    "Request interrupted",
                    exception
            );
        }
    }
}

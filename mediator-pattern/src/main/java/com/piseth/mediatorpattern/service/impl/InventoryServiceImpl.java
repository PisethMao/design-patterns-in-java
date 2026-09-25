package com.piseth.mediatorpattern.service.impl;

import com.piseth.mediatorpattern.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class InventoryServiceImpl implements InventoryService {
    private final Map<String, Integer> stock =
            new ConcurrentHashMap<>(
                    Map.of(
                            "P100", 10,
                            "P200", 5,
                            "P300", 20
                    )
            );

    @Override
    public void reserve(
            String productId,
            int quantity
    ) {
        IO.println(
                "[INVENTORY] Reserving product: "
                        + productId
                        + ", quantity: "
                        + quantity
        );
        stock.compute(
                productId,
                (id, currentStock) -> {
                    if (currentStock == null) {
                        throw new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Product not found: " + productId
                        );
                    }
                    if (currentStock < quantity) {
                        throw new ResponseStatusException(
                                HttpStatus.BAD_REQUEST,
                                "Insufficient stock for product: "
                                        + productId
                        );
                    }
                    return currentStock - quantity;
                }
        );
        IO.println(
                "[INVENTORY] Stock reserved successfully"
        );
    }

    @Override
    public Integer getRemainingStock(
            String productId
    ) {
        return stock.get(productId);
    }
}

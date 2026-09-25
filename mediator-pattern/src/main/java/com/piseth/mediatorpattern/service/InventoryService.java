package com.piseth.mediatorpattern.service;

public interface InventoryService {
    void reserve(String productId, int quantity);

    Integer getRemainingStock(String productId);
}
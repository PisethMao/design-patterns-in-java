package com.piseth.patterns.structural.proxy.cachingproxy.productexample.service;

import com.piseth.patterns.structural.proxy.cachingproxy.productexample.model.Product;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class CachingProductServiceProxy
        implements ProductService {
    private final ProductService target;

    private final Map<UUID, Product> cache =
            new ConcurrentHashMap<>();

    public CachingProductServiceProxy(
            ProductService target
    ) {
        this.target = target;
    }

    @Override
    public Product findById(UUID id) {
        Product cachedProduct = cache.get(id);
        if (cachedProduct != null) {
            IO.println(
                    "[CACHE HIT] Product: " + id
            );
            return cachedProduct;
        }
        IO.println(
                "[CACHE MISS] Product: " + id
        );
        Product product =
                target.findById(id);

        cache.put(id, product);
        return product;
    }
}
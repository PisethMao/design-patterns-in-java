package com.piseth.patterns.structural.proxy.cachingproxy.productexample.service;

import com.piseth.patterns.structural.proxy.cachingproxy.productexample.model.Product;

import java.util.UUID;

public interface ProductService {
    Product findById(UUID id);
}

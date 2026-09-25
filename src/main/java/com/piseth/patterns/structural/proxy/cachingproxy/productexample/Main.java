package com.piseth.patterns.structural.proxy.cachingproxy.productexample;

import com.piseth.patterns.structural.proxy.cachingproxy.productexample.model.Product;
import com.piseth.patterns.structural.proxy.cachingproxy.productexample.service.CachingProductServiceProxy;
import com.piseth.patterns.structural.proxy.cachingproxy.productexample.service.ProductService;
import com.piseth.patterns.structural.proxy.cachingproxy.productexample.service.RemoteProductService;

import java.util.UUID;

public class Main {
    public static void main() {
        UUID productId =
                UUID.fromString(
                        "11111111-1111-1111-1111-111111111111"
                );
        ProductService productService =
                new RemoteProductService();
        ProductService cachingProductService =
                new CachingProductServiceProxy(productService);
        IO.println("=== First request ===");
        Product product1 = cachingProductService.findById(productId);
        IO.println(product1);
        IO.println();
        IO.println("=== Second request ===");
        Product product2 = cachingProductService.findById(productId);
        IO.println(product2);
        IO.println();
        IO.println("=== Third request ===");
        Product product3 = cachingProductService.findById(productId);
        IO.println(product3);
    }
}

package com.piseth.patterns.structural.proxy.protectionproxy.paymentexample;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TransferService transferService = new TransferServiceProxy();
        transferService.transfer("123456", "654321", new BigDecimal("1000"));
    }
}

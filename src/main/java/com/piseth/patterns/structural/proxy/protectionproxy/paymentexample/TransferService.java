package com.piseth.patterns.structural.proxy.protectionproxy.paymentexample;

import java.math.BigDecimal;

public interface TransferService {
    void transfer(String fromAccount, String toAccount, BigDecimal amount);
}

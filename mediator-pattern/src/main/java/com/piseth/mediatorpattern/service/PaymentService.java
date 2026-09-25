package com.piseth.mediatorpattern.service;

import java.math.BigDecimal;

public interface PaymentService {
    String processPayment(BigDecimal amount);
}

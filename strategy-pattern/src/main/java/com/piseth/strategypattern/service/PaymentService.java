package com.piseth.strategypattern.service;

import com.piseth.strategypattern.dto.PaymentRequest;
import com.piseth.strategypattern.dto.PaymentResponse;

public interface PaymentService {
    PaymentResponse pay(PaymentRequest request);
}
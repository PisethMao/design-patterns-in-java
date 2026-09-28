package com.piseth.templatemethod.service;

import com.piseth.templatemethod.dto.PaymentRequest;
import com.piseth.templatemethod.dto.PaymentResponse;

public interface PaymentService {
    PaymentResponse processPayment(PaymentRequest request);
}

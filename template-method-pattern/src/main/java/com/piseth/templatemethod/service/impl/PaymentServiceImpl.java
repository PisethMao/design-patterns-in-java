package com.piseth.templatemethod.service.impl;

import com.piseth.templatemethod.dto.PaymentRequest;
import com.piseth.templatemethod.dto.PaymentResponse;
import com.piseth.templatemethod.factory.PaymentProcessorFactory;
import com.piseth.templatemethod.processor.PaymentProcessor;
import com.piseth.templatemethod.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentProcessorFactory processorFactory;

    public PaymentServiceImpl(PaymentProcessorFactory processorFactory
    ) {
        this.processorFactory = processorFactory;
    }

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        PaymentProcessor processor = processorFactory.getProcessor(request.type());
        return processor.process(request);
    }
}

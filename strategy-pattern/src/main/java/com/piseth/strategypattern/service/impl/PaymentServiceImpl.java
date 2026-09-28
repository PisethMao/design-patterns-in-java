package com.piseth.strategypattern.service.impl;

import com.piseth.strategypattern.domain.PaymentMethod;
import com.piseth.strategypattern.dto.PaymentRequest;
import com.piseth.strategypattern.dto.PaymentResponse;
import com.piseth.strategypattern.exception.UnsupportedPaymentMethodException;
import com.piseth.strategypattern.service.PaymentService;
import com.piseth.strategypattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final Map<PaymentMethod, PaymentStrategy> strategies;

    public PaymentServiceImpl(List<PaymentStrategy> paymentStrategies) {
        this.strategies = new EnumMap<>(PaymentMethod.class);
        paymentStrategies.forEach(strategy -> strategies.put(strategy.supportedMethod(), strategy));
    }

    @Override
    public PaymentResponse pay(PaymentRequest request) {
        PaymentStrategy strategy = strategies.get(request.method());
        if (strategy == null) {
            throw new UnsupportedPaymentMethodException("Unsupported payment method: " + request.method());
        }
        return strategy.pay(request.amount());
    }
}
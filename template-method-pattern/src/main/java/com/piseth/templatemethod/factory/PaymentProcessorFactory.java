package com.piseth.templatemethod.factory;

import com.piseth.templatemethod.enums.PaymentType;
import com.piseth.templatemethod.exception.UnsupportedPaymentTypeException;
import com.piseth.templatemethod.processor.PaymentProcessor;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
public class PaymentProcessorFactory {
    private final Map<PaymentType, PaymentProcessor> processors;

    public PaymentProcessorFactory(List<PaymentProcessor> processors) {
        this.processors = new EnumMap<>(PaymentType.class);
        processors.forEach(processor -> this.processors.put(processor.getType(), processor));
    }

    public PaymentProcessor getProcessor(PaymentType type) {
        PaymentProcessor processor = processors.get(type);
        if (processor == null) {
            throw new UnsupportedPaymentTypeException("Unsupported payment type: " + type);
        }
        return processor;
    }
}

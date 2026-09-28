package com.piseth.templatemethod.processor;

import com.piseth.templatemethod.dto.PaymentRequest;
import com.piseth.templatemethod.enums.PaymentType;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class CardPaymentProcessor extends PaymentProcessor {
    private static final BigDecimal FEE_RATE = new BigDecimal("0.02");

    @Override
    protected BigDecimal calculateFee(PaymentRequest request) {
        BigDecimal fee = request.amount().multiply(FEE_RATE);
        IO.println("[CARD] Card fee: " + fee);
        return fee;
    }

    @Override
    protected String executePayment(PaymentRequest request, BigDecimal fee) {
        IO.println("[CARD] Contacting card network...");
        return "CARD-" + UUID.randomUUID();
    }

    @Override
    protected void beforePayment(PaymentRequest request) {
        IO.println("[CARD] Performing card verification");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.CARD;
    }
}

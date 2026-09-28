package com.piseth.templatemethod.processor;

import com.piseth.templatemethod.dto.PaymentRequest;
import com.piseth.templatemethod.enums.PaymentType;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class BankTransferPaymentProcessor extends PaymentProcessor {
    private static final BigDecimal FEE_RATE = new BigDecimal("0.01");

    @Override
    protected BigDecimal calculateFee(PaymentRequest request) {
        BigDecimal fee = request.amount().multiply(FEE_RATE);
        IO.println("[BANK] Transfer fee: " + fee);
        return fee;
    }

    @Override
    protected String executePayment(PaymentRequest request, BigDecimal fee) {
        IO.println("[BANK] Sending transfer request...");
        return "BANK-" + UUID.randomUUID();
    }

    @Override
    protected void afterPayment(PaymentRequest request, String transactionId) {
        IO.println("[BANK] Recording bank reference: " + transactionId);
    }

    @Override
    public PaymentType getType() {
        return PaymentType.BANK_TRANSFER;
    }
}
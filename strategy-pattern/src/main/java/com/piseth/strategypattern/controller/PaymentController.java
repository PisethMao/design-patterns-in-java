package com.piseth.strategypattern.controller;

import com.piseth.strategypattern.dto.PaymentRequest;
import com.piseth.strategypattern.dto.PaymentResponse;
import com.piseth.strategypattern.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        "/api/v1/payments"
)
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<PaymentResponse> pay(
            @Valid
            @RequestBody
            PaymentRequest request
    ) {
        PaymentResponse response = paymentService.pay(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
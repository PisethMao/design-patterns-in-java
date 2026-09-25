package com.piseth.mediatorpattern.controller;

import com.piseth.mediatorpattern.dto.CheckoutRequest;
import com.piseth.mediatorpattern.dto.CheckoutResponse;
import com.piseth.mediatorpattern.mediator.CheckoutMediator;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/checkouts")
public class CheckoutController {
    private final CheckoutMediator checkoutMediator;

    public CheckoutController(
            CheckoutMediator checkoutMediator
    ) {
        this.checkoutMediator = checkoutMediator;
    }

    @PostMapping
    public ResponseEntity<CheckoutResponse> checkout(
            @Valid
            @RequestBody CheckoutRequest request
    ) {
        CheckoutResponse response = checkoutMediator.checkout(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}

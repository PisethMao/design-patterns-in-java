package com.piseth.mediatorpattern.mediator;

import com.piseth.mediatorpattern.dto.CheckoutRequest;
import com.piseth.mediatorpattern.dto.CheckoutResponse;
import com.piseth.mediatorpattern.service.InventoryService;
import com.piseth.mediatorpattern.service.NotificationService;
import com.piseth.mediatorpattern.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CheckoutMediatorImpl implements CheckoutMediator {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public CheckoutMediatorImpl(
            InventoryService inventoryService,
            PaymentService paymentService,
            NotificationService notificationService
    ) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    @Override
    public CheckoutResponse checkout(
            CheckoutRequest request
    ) {
        IO.println("========== MEDIATOR START ==========");
        String orderId =
                "ORD-"
                        + UUID.randomUUID()
                        .toString()
                        .substring(0, 8)
                        .toUpperCase();
        IO.println("[MEDIATOR] Order created: " + orderId);
        IO.println("[MEDIATOR] Ask InventoryService to reserve stock");
        inventoryService.reserve(
                request.productId(),
                request.quantity()
        );
        IO.println("[MEDIATOR] Ask PaymentService to process payment");
        String paymentId =
                paymentService.processPayment(
                        request.amount()
                );
        IO.println("[MEDIATOR] Ask NotificationService to notify customer");
        notificationService.sendOrderConfirmation(
                request.customerEmail(),
                orderId,
                paymentId
        );
        IO.println("========== MEDIATOR END ==========");
        return new CheckoutResponse(
                orderId,
                paymentId,
                "SUCCESS",
                "Checkout completed successfully"
        );
    }
}

package com.piseth.statepattern.service.impl;

import com.piseth.statepattern.context.OrderContext;
import com.piseth.statepattern.domain.Order;
import com.piseth.statepattern.dto.CreateOrderRequest;
import com.piseth.statepattern.dto.OrderResponse;
import com.piseth.statepattern.exception.OrderNotFoundException;
import com.piseth.statepattern.service.OrderService;
import com.piseth.statepattern.state.OrderStateFactory;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderStateFactory stateFactory;
    private final Map<UUID, Order> orders = new ConcurrentHashMap<>();

    public OrderServiceImpl(
            OrderStateFactory stateFactory
    ) {
        this.stateFactory = stateFactory;
    }

    @Override
    public OrderResponse create(CreateOrderRequest request) {
        Order order =
                new Order(
                        UUID.randomUUID(),
                        request.productName(),
                        request.quantity()
                );
        orders.put(order.getId(), order);
        return OrderResponse.from(order);
    }

    @Override
    public OrderResponse findById(UUID id) {
        return OrderResponse.from(findOrder(id));
    }

    @Override
    public OrderResponse pay(UUID id) {
        return executeTransition(id, OrderContext::pay);
    }

    @Override
    public OrderResponse ship(UUID id) {
        return executeTransition(id, OrderContext::ship);
    }

    @Override
    public OrderResponse deliver(UUID id) {
        return executeTransition(id, OrderContext::deliver);
    }

    @Override
    public OrderResponse cancel(UUID id) {
        return executeTransition(id, OrderContext::cancel);
    }

    private OrderResponse executeTransition(UUID id, Consumer<OrderContext> operation) {
        Order order = findOrder(id);
        synchronized (order) {
            OrderContext context = new OrderContext(order, stateFactory);
            operation.accept(context);
            return OrderResponse.from(order);
        }
    }

    private Order findOrder(UUID id) {
        Order order = orders.get(id);
        if (order == null) {
            throw new OrderNotFoundException(id);
        }
        return order;
    }
}
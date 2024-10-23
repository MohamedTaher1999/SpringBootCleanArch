package org.example.application.service;

import org.example.application.port.input.CreateOrderUseCase;
import org.example.application.port.output.OrderRepository;
import org.example.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderService implements CreateOrderUseCase {

    private final OrderRepository orderRepository;

    public CreateOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(String product, int quantity) {
        Order order = new Order(null, product, quantity);
        return orderRepository.save(order);  // Calls the repository to persist the order
    }
}

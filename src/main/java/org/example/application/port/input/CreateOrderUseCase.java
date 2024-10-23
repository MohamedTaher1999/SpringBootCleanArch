package org.example.application.port.input;

import org.example.domain.Order;

public interface CreateOrderUseCase {
    Order createOrder(String product, int quantity);
}
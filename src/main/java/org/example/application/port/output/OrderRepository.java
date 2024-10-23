package org.example.application.port.output;

import org.example.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
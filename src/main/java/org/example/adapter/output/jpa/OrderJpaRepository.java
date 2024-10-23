package org.example.adapter.output.jpa;

import org.example.application.port.output.OrderRepository;
import org.example.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderJpaRepository implements OrderRepository {

    private final SpringDataOrderRepository springDataOrderRepository;

    public OrderJpaRepository(SpringDataOrderRepository springDataOrderRepository) {
        this.springDataOrderRepository = springDataOrderRepository;
    }

    @Override
    public Order save(Order order) {
        return springDataOrderRepository.save(order);
    }
}

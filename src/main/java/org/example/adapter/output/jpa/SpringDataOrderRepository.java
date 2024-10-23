package org.example.adapter.output.jpa;

import org.example.domain.Order;
import org.springframework.data.repository.CrudRepository;

interface SpringDataOrderRepository extends CrudRepository<Order, Long> {
}

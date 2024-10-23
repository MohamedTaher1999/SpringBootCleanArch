package org.example.adapter.input.web;

import org.example.application.port.input.CreateOrderUseCase;
import org.example.domain.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderUseCase createOrderUseCase;

    public OrderController(CreateOrderUseCase createOrderUseCase) {
        this.createOrderUseCase = createOrderUseCase;
    }

    @PostMapping
    public Order createOrder(@RequestParam String product, @RequestParam int quantity) {
        return createOrderUseCase.createOrder(product, quantity);
    }
}
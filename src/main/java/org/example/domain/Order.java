package org.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")  // Use a non-reserved word
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String product;
    private int quantity;

    public Order(Long id, String product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    // Getters, Setters, and Business Logic
}
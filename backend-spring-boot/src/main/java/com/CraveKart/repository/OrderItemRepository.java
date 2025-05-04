package com.CraveKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CraveKart.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

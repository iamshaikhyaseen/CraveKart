package com.CraveKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CraveKart.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}

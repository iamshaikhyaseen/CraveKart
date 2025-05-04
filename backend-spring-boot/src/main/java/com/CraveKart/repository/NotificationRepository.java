package com.CraveKart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CraveKart.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	public List<Notification> findByCustomerId(Long userId);
	public List<Notification> findByRestaurantId(Long restaurantId);

}

package com.CraveKart.service;

import java.util.List;

import com.CraveKart.model.Notification;
import com.CraveKart.model.Order;
import com.CraveKart.model.Restaurant;
import com.CraveKart.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}

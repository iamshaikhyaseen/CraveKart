package com.CraveKart.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.CraveKart.Exception.CartException;
import com.CraveKart.Exception.OrderException;
import com.CraveKart.Exception.RestaurantException;
import com.CraveKart.Exception.UserException;
import com.CraveKart.model.Order;
import com.CraveKart.model.PaymentResponse;
import com.CraveKart.model.User;
import com.CraveKart.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}

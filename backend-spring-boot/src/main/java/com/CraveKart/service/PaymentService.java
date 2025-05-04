package com.CraveKart.service;

import com.stripe.exception.StripeException;
import com.CraveKart.model.Order;
import com.CraveKart.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}

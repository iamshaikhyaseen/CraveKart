package com.CraveKart.service;

import com.CraveKart.Exception.CartException;
import com.CraveKart.Exception.CartItemException;
import com.CraveKart.Exception.FoodException;
import com.CraveKart.Exception.UserException;
import com.CraveKart.model.Cart;
import com.CraveKart.model.CartItem;
import com.CraveKart.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}

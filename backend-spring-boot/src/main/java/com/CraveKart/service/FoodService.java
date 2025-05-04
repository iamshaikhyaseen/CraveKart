package com.CraveKart.service;

import java.util.List;

import com.CraveKart.Exception.FoodException;
import com.CraveKart.Exception.RestaurantException;
import com.CraveKart.model.Category;
import com.CraveKart.model.Food;
import com.CraveKart.model.Restaurant;
import com.CraveKart.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}

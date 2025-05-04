package com.CraveKart.service;

import java.util.List;

import com.CraveKart.Exception.RestaurantException;
import com.CraveKart.model.Category;

public interface CategoryService {
	
	public Category createCategory (String name,Long userId) throws RestaurantException;
	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
	public Category findCategoryById(Long id) throws RestaurantException;

}

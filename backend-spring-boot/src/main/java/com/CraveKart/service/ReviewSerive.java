package com.CraveKart.service;

import java.util.List;

import com.CraveKart.Exception.ReviewException;
import com.CraveKart.model.Review;
import com.CraveKart.model.User;
import com.CraveKart.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}

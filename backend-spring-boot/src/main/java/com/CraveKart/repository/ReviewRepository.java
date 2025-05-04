package com.CraveKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CraveKart.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}

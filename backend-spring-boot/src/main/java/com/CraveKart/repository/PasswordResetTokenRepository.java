package com.CraveKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CraveKart.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}

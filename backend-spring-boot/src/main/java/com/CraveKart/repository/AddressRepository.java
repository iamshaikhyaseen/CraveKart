package com.CraveKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CraveKart.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

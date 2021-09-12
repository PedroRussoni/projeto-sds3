package com.devsuperior.dvsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dvsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}

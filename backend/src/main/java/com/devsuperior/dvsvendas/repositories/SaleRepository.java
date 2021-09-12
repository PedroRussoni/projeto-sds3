package com.devsuperior.dvsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dvsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

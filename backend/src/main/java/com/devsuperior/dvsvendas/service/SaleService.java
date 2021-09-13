package com.devsuperior.dvsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dvsvendas.dto.SaleDTO;
import com.devsuperior.dvsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dvsvendas.dto.SaleSumDTO;
import com.devsuperior.dvsvendas.entities.Sale;
import com.devsuperior.dvsvendas.repositories.SaleRepository;
import com.devsuperior.dvsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> find_All(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result =repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	public List<SaleSuccessDTO> successGroupBySeller() {
		return repository.successGroupedBySeller();
	}

	public List<SaleSumDTO> amountGroupBySeller() {
		return repository.amountGroupedBySeller();
	}
}

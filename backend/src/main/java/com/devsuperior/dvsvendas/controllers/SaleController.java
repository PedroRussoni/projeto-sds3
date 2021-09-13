package com.devsuperior.dvsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dvsvendas.dto.SaleDTO;
import com.devsuperior.dvsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dvsvendas.dto.SaleSumDTO;
import com.devsuperior.dvsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findALL(Pageable pageable) {
	Page<SaleDTO> list = service.find_All(pageable);
	return ResponseEntity.ok(list);
	
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() {
		List<SaleSumDTO> list = service.amountGroupBySeller();
	return ResponseEntity.ok(list);
	
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller() {
		List<SaleSuccessDTO> list = service.successGroupBySeller();
	return ResponseEntity.ok(list);
	
	}
}
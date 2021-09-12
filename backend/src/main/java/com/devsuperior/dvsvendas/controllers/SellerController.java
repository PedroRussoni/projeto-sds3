package com.devsuperior.dvsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dvsvendas.dto.SellerDTO;
import com.devsuperior.dvsvendas.service.SellerService;

@RestController
@RequestMapping(value = "sellers")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findALL() {
	List<SellerDTO> list = service.find_All();
	return ResponseEntity.ok(list);
	
	}
}
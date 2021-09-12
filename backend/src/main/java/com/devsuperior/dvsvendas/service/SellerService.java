package com.devsuperior.dvsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dvsvendas.dto.SellerDTO;
import com.devsuperior.dvsvendas.entities.Seller;
import com.devsuperior.dvsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> find_All() {
		List<Seller> result =repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}

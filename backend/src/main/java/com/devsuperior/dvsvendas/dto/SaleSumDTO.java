package com.devsuperior.dvsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dvsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String sellernName;
	private Double sum;
	
	public SaleSumDTO() {
		
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellernName = seller.getName();
		this.sum = sum;
	}

	public String getSellernName() {
		return sellernName;
	}

	public void setSellernName(String sellernName) {
		this.sellernName = sellernName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}

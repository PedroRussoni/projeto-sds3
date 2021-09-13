package com.devsuperior.dvsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dvsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String sellernName;
	private Long visited;
	private Long deals
	;
	public SaleSuccessDTO() {
		
	}

	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellernName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}


	public String getSellernName() {
		return sellernName;
	}


	public void setSellernName(String sellernName) {
		this.sellernName = sellernName;
	}


	public Long getVisited() {
		return visited;
	}


	public void setVisited(Long visited) {
		this.visited = visited;
	}


	public Long getDeals() {
		return deals;
	}


	public void setDeals(Long deals) {
		this.deals = deals;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}

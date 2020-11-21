package com.ibm.convertcurrency.entity;

import org.springframework.stereotype.Component;

@Component
public class ConversionFactor {
	
	private Long id;
	
	private Double factor;
	
	private String country;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getFactor() {
		return factor;
	}

	public void setFactor(Double factor) {
		this.factor = factor;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}

package com.ibm.conversionfactor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conversion")
public class ConversionFactor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="country")
	private String country;
	
	@Column(name="factor")
	private Double factor;

	public ConversionFactor(Long id, String country, Double factor) {
		super();
		this.id = id;
		this.country = country;
		this.factor = factor;
	}
	
	public ConversionFactor() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getFactor() {
		return factor;
	}

	public void setFactor(Double factor) {
		this.factor = factor;
	}
	
	
	

}

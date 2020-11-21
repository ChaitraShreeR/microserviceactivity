package com.ibm.convertcurrency.service;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.convertcurrency.entity.ConversionFactor;

@FeignClient(name="conversion-factor")
public interface ConversioFactorClient {
	
	@GetMapping("/getFactorCountry/{country}")
	public ConversionFactor getConversionFactoryByCountry(@PathVariable String country);
	
}

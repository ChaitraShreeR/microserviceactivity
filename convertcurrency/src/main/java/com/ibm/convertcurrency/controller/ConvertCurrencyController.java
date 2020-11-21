package com.ibm.convertcurrency.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.convertcurrency.entity.ConversionFactor;
import com.ibm.convertcurrency.service.ConversioFactorClient;


@RestController
public class ConvertCurrencyController {
	
	@Autowired
	ConversioFactorClient factClient;
	
	@GetMapping("/convert/{country}/{amount}")
	public String convertCurrency(@PathVariable String country,@PathVariable Double amount) {
		ConversionFactor convfac=factClient.getConversionFactoryByCountry(country);
		Double factor =convfac.getFactor();
		System.out.println("the factor is "+factor);
		Double convertedAmount=amount/factor;
		return "For country "+country+" the converted amount is "+convertedAmount;
	}
}

package com.ibm.conversionfactor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.conversionfactor.entity.ConversionFactor;
import com.ibm.conversionfactor.repository.ConversionFactoryRepository;

@RestController
public class ConversionFactorController {

	@Autowired
	ConversionFactoryRepository conversionFactoryrepo;
	
	@GetMapping("/getFactor/{id}")
	public ConversionFactor getConversionFactory(@PathVariable Long id) {
		System.out.println("Factor before is"+id);
		//System.out.println("Factor repo "+conversionFactoryrepo.find
		Optional<ConversionFactor> convFact = conversionFactoryrepo.findById(id);
		
		System.out.println("Factor repo "+conversionFactoryrepo.findById(id));
		System.out.println("Factor is "+convFact);
		return convFact.get();
	}
	
	@GetMapping("/getFactorCountry/{country}")
	public ConversionFactor getConversionFactoryByCountry(@PathVariable String country) {
		Optional<ConversionFactor> convFact = conversionFactoryrepo.findByCountry(country);

		return convFact.get();
	}
	
	@PutMapping("/updateFactor/{Id}")
	public ResponseEntity<ConversionFactor> updateConversionFactor(@PathVariable("Id") Long Id, @RequestBody ConversionFactor conversionFactor) {
		
		Optional<ConversionFactor> cf = conversionFactoryrepo.findById(Id);
		
		ConversionFactor cf_new = cf.get();
		cf_new.setCountry(conversionFactor.getCountry());
		cf_new.setFactor(conversionFactor.getFactor());
		
		return new ResponseEntity<>(conversionFactoryrepo.save(cf_new),HttpStatus.OK);
	}
	
	@PostMapping("/addFactor")
	public ResponseEntity<ConversionFactor> addConversionFactor(@RequestBody ConversionFactor addFactor) {
		
		ConversionFactor cf_add = conversionFactoryrepo.save(addFactor);
		
		return new ResponseEntity<>(cf_add, HttpStatus.CREATED);
	} 
}

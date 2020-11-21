package com.ibm.conversionfactor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ibm.conversionfactor.entity.ConversionFactor;

@Component
@Repository
public interface ConversionFactoryRepository extends JpaRepository<ConversionFactor,Long>{

	Optional<ConversionFactor> findById(Long id);
	Optional<ConversionFactor> findByCountry(String country);
	
}

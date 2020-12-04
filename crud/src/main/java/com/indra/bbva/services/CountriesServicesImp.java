package com.indra.bbva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.CountriesEntity;
import com.indra.bbva.repository.CountriesRepository;

@Service
public class CountriesServicesImp implements CountriesServices {

	@Autowired
	private CountriesRepository repoCountry;
	
	public List<CountriesEntity> getCountries(){
		return repoCountry.findAll();
		
	}
	
	public ResponseEntity<Object> getCountry(String countryID){
		return new ResponseEntity<>(repoCountry.findById(countryID), HttpStatus.OK);
	}
	
	public ResponseEntity<Object> createCountry(CountriesEntity country){
		return new ResponseEntity<>(repoCountry.save(country), HttpStatus.OK);
	}
	
	public void updateCountry(String countryID, CountriesEntity country) {
		repoCountry.save(country);
	}
	
	public void deleteCountry(String countryID) {
		repoCountry.deleteById(countryID);
	}
	
}

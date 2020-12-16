package com.indra.bbva.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.bbva.model.CountriesEntity;
import com.indra.bbva.repository.CountriesRepository;
import com.indra.bbva.services.CountriesServices;


@RestController
public class CountriesController {

	@Autowired
	private CountriesServices countriesService;
	
	//@Autowired
	//private CountriesRepository countryRepository;
	
	/*@GetMapping("/join")
	public List<CountriesEntity> getJoinCountrieRegion(){
		return countriesService.getJoinCountrieRegion();
	}*/
	
	
	
	@GetMapping("/countries")
	public List<CountriesEntity> getCountries(){
		return countriesService.getCountries();
	}
	
	
	@GetMapping("/countries/{countryId}")
	public ResponseEntity<Object> getCountry(@PathVariable String countryId){
		return countriesService.getCountry(countryId);
	}
	
	@PostMapping("/countries/create")
	public ResponseEntity<Object> createCountry(@RequestBody CountriesEntity country){
		ResponseEntity<Object> savedCountry = countriesService.createCountry(country);
		return null;
	}
	
	@PutMapping("/countries/update/{countryID}")
	public void updateCountry(@PathVariable String countryID, @RequestBody CountriesEntity country) {
		countriesService.updateCountry(countryID, country);
	}
	
	@DeleteMapping("/countries/{countryID}")
	public void deleteCountry(@PathVariable String countryID) {
		countriesService.deleteCountry(countryID);
	}
	
	

	
}

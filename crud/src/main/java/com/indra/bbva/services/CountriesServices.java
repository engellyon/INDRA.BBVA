package com.indra.bbva.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.indra.bbva.model.CountriesEntity;
import com.indra.bbva.model.CountryJoinRegion;

public interface CountriesServices {
	
	public abstract List<CountryJoinRegion> getJoinCountrieRegion();
	
	
	public abstract List<CountriesEntity> getCountries();
	public abstract ResponseEntity<Object> getCountry(String countryID);
	public abstract ResponseEntity<Object> createCountry(CountriesEntity country);
	public abstract void updateCountry(String countryID, CountriesEntity country);
	public abstract void deleteCountry (String countryID);
}

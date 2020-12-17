package com.indra.bbva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.*;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, String> {
	//Aqui van las consultas   que no sean directas, o con condiciones where
	//En caso de necesitarlo 
	
	@Query("SELECT new com.indra.bbva.model.CountryJoinRegion( c.countryName, r.regionName) FROM CountriesEntity c  JOIN c.region r" )
	public List<CountryJoinRegion> getJoinCountrieRegion();
	
}
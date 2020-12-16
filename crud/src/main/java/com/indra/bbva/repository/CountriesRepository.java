package com.indra.bbva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.*;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, String> {
	//Aqui van las consultas   que no sean directas, o con condiciones where
	//En caso de que si se ahcen los metodos 
	
	
	//@Query(value ="SELECT  country_name, region_name FROM countries JOIN regions ON regions.region_id = countries.region_id", nativeQuery = true)
	//List<CountriesEntity> getJoinInformatio();
}
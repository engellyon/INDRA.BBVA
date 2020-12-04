package com.indra.bbva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.*;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, String> {
	//Aqui van las consultas   que no sean directas, o con condiciones where
	//En caso de que si se ahcen los metodos 
	
}
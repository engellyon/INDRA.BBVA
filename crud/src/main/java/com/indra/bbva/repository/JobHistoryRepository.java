package com.indra.bbva.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.JobHistoryEntity;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistoryEntity, Integer> {
	
	//Método par buscar pot ID te  regresa  todos los que tienen le mismo ID
	@Transactional
	  List<JobHistoryEntity> findByEmployeeID(int employee_id);
	
	//Método para eliminar por Id borro tados los que tenga el mismo ID  aunque esten repetidos
	@Transactional
	void deleteByEmployeeID(int employee_id);
	
	
	//Método para buscar por id y fecha
	@Query(value="SELECT * FROM job_history WHERE employee_id = ?1 and start_date = ?2", nativeQuery = true)
	List<JobHistoryEntity>findByEmployeeIDAndStartDate(int employee_id, String start_date);

	
	//Método para eliminar por ID y fecha que es la llave primaria
	@Query(value= "DELETE FROM job_history WHERE employee_id = ?1 and start_date = ?2", nativeQuery = true)
	void deleteByEmployeeIDAndStartDate(int employee_id, String start_date);
	
}

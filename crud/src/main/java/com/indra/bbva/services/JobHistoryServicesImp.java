package com.indra.bbva.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.JobHistoryEntity;
import com.indra.bbva.repository.JobHistoryRepository;

@Service
public class JobHistoryServicesImp implements JobHistoryServices{

	@Autowired
	private JobHistoryRepository repoHistory;
	

	
	
	
	public List<JobHistoryEntity> getJobHistories(){
		return repoHistory.findAll();
	}
	

	
	public ResponseEntity<Object> createHistory(JobHistoryEntity history){
		return new ResponseEntity<>(repoHistory.save(history), HttpStatus.OK);
	}
	
	
	
	public void updateJobHistory (int id, JobHistoryEntity history) {
		repoHistory.save(history);
		
	}
	public void deleteJobHistory (int id) {
		repoHistory.deleteById(id);
	}



	//Metodos Extras De prueba
	@Override
	public List<JobHistoryEntity> getHistory(int employee_id ) {
		return repoHistory.findByEmployeeID(employee_id);
	}
	@Override
	public void deleteHistory(int employee_id) {
		repoHistory.deleteByEmployeeID(employee_id);
	}
	
	
	
	@Override
	public List<JobHistoryEntity> findByEmployeeIDAndSTART_DATE(int employee_id, String start_date) {
		String dia = start_date.substring(0,2);
		String mes = start_date.substring(2,4);
		String año = start_date.substring(4);
		String fecha = dia+'/'+mes+'/'+año;
		return repoHistory.findByEmployeeIDAndStartDate(employee_id, fecha);
	}



	@Override
	public void deletejHistory(int employee_id, String start_date) {
		String dia = start_date.substring(0,2);
		String mes = start_date.substring(2,4);
		String año = start_date.substring(4);
		String fecha = dia+'/'+mes+'/'+año;
		repoHistory.deleteByEmployeeIDAndStartDate(employee_id, fecha);
		
	}

	
	
}

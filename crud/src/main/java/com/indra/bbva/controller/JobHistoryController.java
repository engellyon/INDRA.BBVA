package com.indra.bbva.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.bbva.model.JobHistoryEntity;
import com.indra.bbva.services.JobHistoryServices;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@RestController
public class JobHistoryController {
	
	@Autowired
	private JobHistoryServices  historyService;
	
	
	
	//Metodo de prueba
	
	@GetMapping("/jobHistory/{employeeId}")
	public List<JobHistoryEntity> getHistory(@PathVariable int employeeId){
		return historyService.getHistory(employeeId);
	}
	
	//Este método elimina todos los que tiene el mismo employeeId sin contar la fecha de Ingreso
	@DeleteMapping("/history/{employeeId}")
	public void deleteHistory (@PathVariable int employeeId) {
		historyService.deleteHistory(employeeId);
	}
	
	//Método que regresa por la llave compuesta id y fecha la fecha se pasa por dia mes y año
	//Ejemplo de URL = http://localhost:8080/jhistory/122/01012001  
	@GetMapping("/jhistory/{employee_id}/{start_date}")
	public List<JobHistoryEntity> findByEmployeeIDAndSTART_DATE(@PathVariable int employee_id, @PathVariable String start_date) {
		
		return historyService.findByEmployeeIDAndSTART_DATE(employee_id, start_date);
	}
	
	//Método que elimina por la llave compuesta id y fecha la fecha se pasa por dia mes y año
		//Ejemplo de URL = http://localhost:8080/jhistory/180/13011999
	@DeleteMapping("/jhistory/{employee_id}/{start_date}")
	public void deletejHistory(@PathVariable int employee_id, @PathVariable String start_date) {
		
		historyService.deletejHistory(employee_id, start_date);
	}
	
	//Hasta aquí metodos de prueba
	
	
	
	
	@GetMapping("/jobHistory")
	public List<JobHistoryEntity> getJobHistories(){
		return historyService.getJobHistories();
	}
	
	
	
	@PostMapping("/jobHistory")
	public ResponseEntity<Object> createHistory(@RequestBody JobHistoryEntity history){
		ResponseEntity<Object> saveHistory = historyService.createHistory(history);
		return null;
	}
	
	@PutMapping("/jobHistory/{employeeId}")
	public void updateJobHistory (@PathVariable int employeeId, @RequestBody JobHistoryEntity history) {		
		historyService.updateJobHistory(employeeId, history);
	}
	
	/*
	@DeleteMapping("/jobHistory/{employeeId}")
	public void deleteJobHistory (@PathVariable int employeeId) {
		historyService.deleteJobHistory(employeeId);
	}*/
	
	
	
}

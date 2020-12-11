package com.indra.bbva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.DepartmentsEntity;
import com.indra.bbva.repository.DepartmentsRepository;

@Service
public class DepartmentsServicesImp implements DepartmentsServices {

	@Autowired
	private DepartmentsRepository depa;
	
	public List<DepartmentsEntity> getDepartamentos(){
		return depa.findAll();
	}
	
	public ResponseEntity<Object> getDepartamento(int departmentID) {
		return new ResponseEntity<>(depa.findById(departmentID), HttpStatus.OK);
	}
	
	public ResponseEntity<Object> createDepartamento (DepartmentsEntity departamento){
		return new ResponseEntity<>(depa.save(departamento), HttpStatus.OK);
	}
	
	public void updateDepartamento (int departmentID, DepartmentsEntity departamento) {
		depa.save(departamento);
	}
	
	public void deleteDepartamento(int departmentID) {
		depa.deleteById(departmentID);
	}

	
	
}

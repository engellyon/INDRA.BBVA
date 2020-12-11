package com.indra.bbva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.EmployessEntity;
import com.indra.bbva.repository.EmployessRepository;

@Service
public class EmployessServicesImp implements EmployessServices {

	@Autowired
	private EmployessRepository repoEmployess;
	
	public List<EmployessEntity> getEmpleados(){
		return 	repoEmployess.findAll();
	}
	
	public ResponseEntity<Object> getEmpleado(int employeeId){
		return new ResponseEntity<>(repoEmployess.findById(employeeId), HttpStatus.OK);

	}
	
	public ResponseEntity<Object> createEmpleado(EmployessEntity employee){
		return new ResponseEntity<>(repoEmployess.save(employee), HttpStatus.OK);
	}
	
	public void updateEmpleado (int employeeId, EmployessEntity employee) {
		repoEmployess.save(employee);
	}
	
	public void deleteEmpleado(int employeeId) {
		repoEmployess.deleteById(employeeId);
	}
	
	
}


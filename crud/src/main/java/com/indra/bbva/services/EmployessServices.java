package com.indra.bbva.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.indra.bbva.model.DepartmentsEntity;
import com.indra.bbva.model.EmployessEntity;


public interface EmployessServices {

	public abstract List<EmployessEntity> getEmpleados();
	public abstract ResponseEntity<Object> getEmpleado(int id);
	public abstract ResponseEntity<Object> createEmpleado(EmployessEntity employee);
	public abstract void updateEmpleado (int id, EmployessEntity employee);
	public abstract void deleteEmpleado (int id);

	
}

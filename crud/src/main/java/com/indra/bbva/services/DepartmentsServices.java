package com.indra.bbva.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.indra.bbva.model.DepartmentsEntity;



public interface DepartmentsServices {
	
	public abstract List<DepartmentsEntity> getDepartamentos();
	public abstract ResponseEntity<Object> getDepartamento(int id);
	public abstract ResponseEntity<Object> createDepartamento(DepartmentsEntity departamento);
	public abstract void updateDepartamento (int id, DepartmentsEntity departamento);
	public abstract void deleteDepartamento (int id);

}

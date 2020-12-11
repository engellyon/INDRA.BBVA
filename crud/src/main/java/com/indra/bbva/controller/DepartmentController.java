package com.indra.bbva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.bbva.model.DepartmentsEntity;
import com.indra.bbva.repository.DepartmentsRepository;
import com.indra.bbva.services.DepartmentsServices;

@RestController
public class DepartmentController {
	
	//Creamos un atributo de deparmetns service
		@Autowired
		private DepartmentsServices departmentsService;
		
		
		
		@GetMapping("/departamentos")
		public List<DepartmentsEntity> getDepartamentos(){
			return departmentsService.getDepartamentos();
		}
		
		@GetMapping("/departamento/{departmentsID}")
		public ResponseEntity<Object> getDepartamento(@PathVariable int departmentsID) {
			return departmentsService.getDepartamento(departmentsID); 
		}
		
		
		@PostMapping("/departamento")
		public ResponseEntity<Object> createCountry(@RequestBody DepartmentsEntity departments){
			ResponseEntity<Object> savedDepa = departmentsService.createDepartamento(departments);
			return null;
		}
		
		@PutMapping("/departamento/{departmentsID}")
		public void updateDepartamento(@RequestBody DepartmentsEntity departments, @PathVariable Integer departmentsID) {
			departmentsService.updateDepartamento(departmentsID, departments);
		}
		
		@DeleteMapping("/departamento/{departmentsID}")
		public void deleteDepartamento(@PathVariable Integer departmentsID) {
			departmentsService.deleteDepartamento(departmentsID);
		}


}

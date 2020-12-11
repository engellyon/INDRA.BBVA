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

import com.indra.bbva.model.EmployessEntity;
import com.indra.bbva.services.EmployessServices;

@RestController
public class EmployessController {
	
	@Autowired
	private EmployessServices employeeService;
	
	//@Autowired
	//private EmployessRepository employeeRepository;
	
	
	@GetMapping("/empleados")
	public List<EmployessEntity> getEmpleados(){
		return employeeService.getEmpleados();
	}
	
	@GetMapping("/empleado/{employeeId}")
	public ResponseEntity<Object> getEmpleado(@PathVariable int employeeId){
		return employeeService.getEmpleado(employeeId);
	}
	
	@PostMapping("/empleado")
	public ResponseEntity<Object> createEmpleado(@RequestBody EmployessEntity employee){
		ResponseEntity<Object> saveEmployee = employeeService.createEmpleado(employee);
		return null;
	}
	
	@PutMapping("/empleado/{employeeId}")
	public void updateEmpleado(@PathVariable int employeeId, @RequestBody EmployessEntity employee){
		employeeService.updateEmpleado(employeeId, employee);
	}
	
	
	@DeleteMapping("/empleado/{employeeId}")
	public void deleteEmpleado(@PathVariable int employeeId) {
		employeeService.deleteEmpleado(employeeId);
	}
	


}

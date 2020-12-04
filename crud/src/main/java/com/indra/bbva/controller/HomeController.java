package com.indra.bbva.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/inicio")
	public String inicio() {
		return "Inicio de la pagina  de CRUD";
	}
	
	@GetMapping("/usuarios")
	public String getUsuarios() {
		return "Pagina que debe  de mostrat los usuarios";
	}
	
	//@PostMapping("/usuarios") @RequestBody int id
	@GetMapping("/CreateUsuarios")
	public String createUsuario() {
		return "Pagian para crea u usuario se manda el id por request";
	}
	
	//@PutMapping("/usuario/{id}")
	@GetMapping("/UpdateUsuarios")
	public String updateUsuario(@PathVariable int id) {
		return "Aqui tenemso que hacer la actuaizacion de  usuario";
		
	}
	
	//@DeleteMapping("/usuario/{id}")
	@GetMapping("/DeleteUsuarios")
	public String deleteUsuario(@PathVariable int id) {
		return "Se elimina el usuario por ID";
		
	}
	

}

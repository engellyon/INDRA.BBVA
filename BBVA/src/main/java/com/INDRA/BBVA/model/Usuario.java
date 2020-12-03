package com.INDRA.BBVA.model;


//para relacionar la clase con una entidad de la base
//Falta varias anotaciones para persisten
// es para JPA @Entity  
public class Usuario {

	private Integer id;
	private String usuario;
	private String password;
	
	
	public Usuario() {}
	
	public Usuario(Integer id, String usaurio, String password) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario() {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword() {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + usuario + " password  *********";
	}
	
}

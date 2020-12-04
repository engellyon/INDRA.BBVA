package com.indra.bbva.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CountriesEntity {
	
	@Id
	@Size(max=2, message = "El id  es de dos letras")
	private char countryID;
	
	@NotNull
	private String countryName;
	
	@NotNull
	private int number;
	
	
	public CountriesEntity() {}


	public CountriesEntity(char countryID, String countryName, int number) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
		this.number = number;
	}

	public char getCountryID() {
		return countryID;
	}
	
	public void setCountryID(char countryID) {
		this.countryID = countryID;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "CountriesEntity [countryID=" + countryID + ", countryName=" + countryName + ", number=" + number + "]";
	}
	
	
	
	
}

package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Countries")
public class CountriesEntity {
	
	@Id
	@Column(name="COUNTRY_ID")
	private String countryID;
	
	@NotNull
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@NotNull
	@Column(name="REGION_ID")
	private int number;
	
	
	public CountriesEntity() {}


	public CountriesEntity(String countryID, String countryName, int number) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
		this.number = number;
	}

	public String getCountryID() {
		return countryID;
	}
	
	public void setCountryID(String countryID) {
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

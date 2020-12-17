package com.indra.bbva.model;

import java.io.Serializable;



public class CountryJoinRegion  implements Serializable{


	private static final long serialVersionUID = 1L;
	private String regionName;
	private String countryName;
	
	

	public CountryJoinRegion(String regionName, String countryName) {
		super();
		this.regionName = regionName;
		this.countryName = countryName;
	}
	
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	
	
}

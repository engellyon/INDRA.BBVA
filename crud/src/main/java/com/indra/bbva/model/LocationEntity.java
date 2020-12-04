package com.indra.bbva.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LocationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int locationID;
	
	private String streetAddress;
	private String postalCode;
	
	@NotNull
	private String city;
	private String stateProvince;
	
	@Size(min=2, max=2)
	private char  countryID;
	
	public LocationEntity() {}

	public LocationEntity(int locationID, String streetAddress, String postalCode, String city, String stateProvince,
			char countryID) {
		super();
		this.locationID = locationID;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryID = countryID;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public char getCountryID() {
		return countryID;
	}

	public void setCountryID(char countryID) {
		this.countryID = countryID;
	}

	@Override
	public String toString() {
		return "LocationEntity [locationID=" + locationID + ", streetAddress=" + streetAddress + ", postalCode="
				+ postalCode + ", city=" + city + ", stateProvince=" + stateProvince + ", countryID=" + countryID + "]";
	}
	
	

}

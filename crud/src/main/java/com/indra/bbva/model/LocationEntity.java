package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="LOCATIONS")
public class LocationEntity {
	
	@Id
	@Column(name="LOCATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="LOCATIONS_SEQ")
    @SequenceGenerator(name="LOCATIONS_SEQ", sequenceName = "LOCATIONS_SEQ", allocationSize=1)
	private int locationID;
	
	@Column(name="STREET_ADDRESS")
	private String streetAddress;
	
	@Column(name="POSTAL_CODE")
	private String postalCode;
	
	@NotNull
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE_PROVINCE")
	private String stateProvince;
	
	@Size(min=2, max=2)
	@Column(name="COUNTRY_ID")
	private String  countryID;
	
	
	public LocationEntity() {}

	public LocationEntity(int locationID, String streetAddress, String postalCode, String city, String stateProvince,
			String countryID) {
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

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}

	@Override
	public String toString() {
		return "LocationEntity [locationID=" + locationID + ", streetAddress=" + streetAddress + ", postalCode="
				+ postalCode + ", city=" + city + ", stateProvince=" + stateProvince + ", countryID=" + countryID + "]";
	}
	
	

}

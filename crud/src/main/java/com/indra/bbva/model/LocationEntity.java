package com.indra.bbva.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="LOCATIONS")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class LocationEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

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
	
	@Column(name="COUNTRY_ID")
	private String  countryID;
	
	@ManyToOne(targetEntity = CountriesEntity.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "COUNTRY_ID", insertable = false, updatable = false)
	@JsonIgnore
	private CountriesEntity country;
	
	
	
	
	
	public CountriesEntity getCountry() {
		return country;
	}

	public void setCountry(CountriesEntity country) {
		this.country = country;
	}

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

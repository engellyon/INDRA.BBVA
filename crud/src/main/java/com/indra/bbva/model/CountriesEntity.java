package com.indra.bbva.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="Countries")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class CountriesEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COUNTRY_ID")
	private String countryID;
	
	@NotNull
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@NotNull
	@Column(name="REGION_ID")
	private int regionId;
	
	@ManyToOne(targetEntity=RegionsEntity.class, fetch=FetchType.EAGER)
	@JoinColumn(name="REGION_ID",  insertable = false, updatable = false)
	@JsonIgnore
	private RegionsEntity region;
	
	
	
	public CountriesEntity() {}


	public CountriesEntity(String countryID, String countryName, int regionId ) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
		this.regionId = regionId;
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


	public int getRegionId() {
		return regionId;
	}


	public RegionsEntity getRegion() {
		return region;
	}


	public void setRegion(RegionsEntity region) {
		this.region = region;
	}


	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}


	@Override
	public String toString() {
		return "CountriesEntity [countryID=" + countryID + ", countryName=" + countryName + ", number=" + regionId + "]";
	}
	
	
	
	
}

package com.indra.bbva.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="REGIONS")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class RegionsEntity implements Serializable {

	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="REGION_ID")
	private int regionID;
	
	@Column(name="REGION_NAME")
	private String regionName;
	
	//@OneToMany(mappedBy = "region")
    @OneToMany(targetEntity=CountriesEntity.class, mappedBy = "region")	
	private List<CountriesEntity> countries = new ArrayList<>();
	

	public RegionsEntity() {}

	public RegionsEntity(int regionID, String regionName) {
		super();
		this.regionID = regionID;
		this.regionName = regionName;
	}

	public int getRegionID() {
		return regionID;
	}

	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "RegionsEntity [regionID=" + regionID + ", regionName=" + regionName + "]";
	}
	
	
	
}

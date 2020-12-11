package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGIONS")
public class RegionsEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="REGION_ID")
	private int regionID;
	
	@Column(name="REGION_NAME")
	private String regionName;
	

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

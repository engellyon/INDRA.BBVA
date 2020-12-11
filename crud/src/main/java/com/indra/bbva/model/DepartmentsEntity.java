package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Departments")
public class DepartmentsEntity {

	@Id
	@Column(name="DEPARTMENT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DEPARTMENTS_SEQ")
    @SequenceGenerator(name="DEPARTMENTS_SEQ", sequenceName = "DEPARTMENTS_SEQ", allocationSize=1)
	private int departmentID;
	
	@NotNull
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;
	
	
	@Column(name="MANAGER_ID")
	private Integer managerID;
	
	
	@Column(name="LOCATION_ID")
	private int locationID;
	
	public DepartmentsEntity() {}
	
	public DepartmentsEntity(int departmentID, String departmentName, Integer managerID, int locationID) {
	
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.managerID = managerID;
		this.locationID = locationID;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerID() {
		return managerID;
	}

	public void setManagerID(Integer managerID) {
		this.managerID = managerID;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	@Override
	public String toString() {
		return "DepartmentsEntity [departmentID=" + departmentID + ", departmentName=" + departmentName + ", managerID="
				+ managerID + ", locationID=" + locationID + "]";
	}
	

	
	
}

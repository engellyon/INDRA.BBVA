package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Departments")
public class DepartmentsEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="DEPARTMENT_ID")
	private int departmentID;
	
	@NotNull
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;
	
	@NotNull
	@Column(name="MANAGER_ID")
	private int managerID;
	
	@NotNull
	@Column(name="LOCATION_ID")
	private int locationID;
	
	public DepartmentsEntity() {}
	
	public DepartmentsEntity(int departmentID, String departmentName, int managerID, int locationID) {
	
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

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
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

package com.indra.bbva.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="JOB_HISTORY")
public class JobHistoryEntity {

	
	@Column(name="EMPLOYEE_ID")
	private int employeeID;
	
	@Id
	@NotNull //@Past
	@Column(name="START_DATE")
	private Date startDate;
	
	
	@NotNull //@Past
	@Column(name="END_DATE")
	private Date endDate;
	
	@NotNull
	@Column(name="JOB_ID")
	private String jobID;
	
	@Column(name="DEPARTMENT_ID")
	private int DepartmentID;
	
	
	
	public JobHistoryEntity() {}

	public JobHistoryEntity(int employeeID, Date startDate, Date endDate, String jobID, int departmentID) {
		super();
		this.employeeID = employeeID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobID = jobID;
		DepartmentID = departmentID;
	}
	
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public int getDepartmentID() {
		return DepartmentID;
	}

	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}

	@Override
	public String toString() {
		return "JobHistory [employeeID=" + employeeID + ", startDate=" + startDate + ", endDate=" + endDate + ", jobID="
				+ jobID + ", DepartmentID=" + DepartmentID + "]";
	}

	
	
	
	
	
}

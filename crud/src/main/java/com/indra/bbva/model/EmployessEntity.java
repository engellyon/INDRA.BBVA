package com.indra.bbva.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class EmployessEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee;
	
	
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String email;
	private String phoneNumbre;
	
	@NotNull @Past
	private Date hireDate;
	
	@NotNull @Past
	private String jobId;
	
	
	private float salary;
	private float commissionPCT;
	private int managerID;
	private int departmentID;
	
	
	public EmployessEntity() {}
	
	
	public EmployessEntity(int employee, String firstName, String lastName, String email, String phoneNumbre,
			Date hireDate, String jobId, float salary, float commissionPCT, int managerID, int departmentID) {
		
		this.employee = employee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumbre = phoneNumbre;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commissionPCT = commissionPCT;
		this.managerID = managerID;
		this.departmentID = departmentID;
	}



	public int getEmployee() {
		return employee;
	}
	public void setEmployee(int employee) {
		this.employee = employee;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumbre() {
		return phoneNumbre;
	}
	public void setPhoneNumbre(String phoneNumbre) {
		this.phoneNumbre = phoneNumbre;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getCommissionPCT() {
		return commissionPCT;
	}
	public void setCommissionPCT(float commissionPCT) {
		this.commissionPCT = commissionPCT;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}



	@Override
	public String toString() {
		return "EmployessEntity [employee=" + employee + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumbre=" + phoneNumbre + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", salary=" + salary + ", commissionPCT=" + commissionPCT + ", managerID=" + managerID
				+ ", departmentID=" + departmentID + "]";
	}
	
	
	

}

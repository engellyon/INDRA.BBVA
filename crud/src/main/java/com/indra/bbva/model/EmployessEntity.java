package com.indra.bbva.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="EMPLOYEES")
public class EmployessEntity {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="EMPLOYEES_SEQ")
    @SequenceGenerator(name="EMPLOYEES_SEQ", sequenceName = "EMPLOYEES_SEQ", allocationSize=1)
	private int employeeId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@NotNull
	@Column(name="LAST_NAME")
	private String lastName;
	
	@NotNull
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumbre;
	
	@NotNull //@Past
	@Column(name="HIRE_DATE")
	private Date hireDate;
	
	@NotNull //@Past
	@Column(name="JOB_ID")
	private String jobId;
	
	@Column(name="SALARY")
	private Float salary;
	
	@Column(name="COMMISSION_PCT")
	private  Float commissionPCT;
	
	@Column(name="MANAGER_ID")
	private Integer managerID;
	
	@Column(name="DEPARTMENT_ID")
	private Integer departmentID;
	

	
	public EmployessEntity() {}
	
	
	public EmployessEntity(int employeeId, String firstName, String lastName, String email, String phoneNumbre,
			Date hireDate, String jobId, float salary, float commissionPCT, int managerID, int departmentID) {
		
		this.employeeId = employeeId;
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
		return employeeId;
	}
	public void setEmployee(int employeeId) {
		this.employeeId = employeeId;
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
	public Float getCommissionPCT() {
		return commissionPCT;
	}
	public void setCommissionPCT(float commissionPCT) {
		this.commissionPCT = commissionPCT;
	}
	public Integer getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}



	@Override
	public String toString() {
		return "EmployessEntity [employee=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumbre=" + phoneNumbre + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", salary=" + salary + ", commissionPCT=" + commissionPCT + ", managerID=" + managerID
				+ ", departmentID=" + departmentID + "]";
	}
	
	
	

}

package com.indra.bbva.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class JobsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String jobID;
	
	@NotNull
	private String jobTitle;
	private int minSalary;
	private int maxSalary;
	
	public JobsEntity() {}

	public JobsEntity(String jobID, String jobTitle, int minSalary, int maxSalary) {
		super();
		this.jobID = jobID;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "Jobs [jobID=" + jobID + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + "]";
	}
	
	
}

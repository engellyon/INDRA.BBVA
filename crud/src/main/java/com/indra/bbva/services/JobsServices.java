package com.indra.bbva.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.indra.bbva.model.JobsEntity;

public interface JobsServices {
	
	public abstract List<JobsEntity> getJobs();
	public abstract ResponseEntity<Object> getJob(String jobId);
	public abstract ResponseEntity<Object> createJob(JobsEntity job);
	public abstract void updateJob(String jobId, JobsEntity job);
	public abstract void deleteJob (String jobId);
	
	
}

package com.indra.bbva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.JobsEntity;
import com.indra.bbva.repository.JobRepository;

@Service
public class JobsServicesImp implements JobsServices {

	@Autowired
	private JobRepository repoJobs;
	
	public List<JobsEntity> getJobs(){
		return repoJobs.findAll();
		
	}
	
	public ResponseEntity<Object> getJob(String jobId){
		return new ResponseEntity<>(repoJobs.findById(jobId), HttpStatus.OK);
	}
	
	public ResponseEntity<Object> createJob(JobsEntity job){
		return new ResponseEntity<>(repoJobs.save(job), HttpStatus.OK);
	}
	
	public void  updateJob(String jobId, JobsEntity job) {
		repoJobs.save(job);
	}
	
	public void deleteJob(String jobId) {
		repoJobs.deleteById(jobId);
	}
	
}

package com.indra.bbva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.bbva.model.CountriesEntity;
import com.indra.bbva.model.JobsEntity;
import com.indra.bbva.repository.JobRepository;
import com.indra.bbva.services.JobsServices;

@RestController
public class JobsController {

	@Autowired
	private JobsServices jobsService;
	
	@Autowired
	private JobRepository jobsRepository;
	

	@GetMapping("/jobs")
	public List<JobsEntity> getJobs(){
		return jobsService.getJobs();
	}
	
	@GetMapping("/job/{jobId}")
	public ResponseEntity<Object> getJob(@PathVariable String jobId){
		return jobsService.getJob(jobId);
	}
	
	@PostMapping("/job")
	public ResponseEntity<Object> createJob(@RequestBody JobsEntity job){
		ResponseEntity<Object> savedJob = jobsService.createJob(job);
		return null;
	}
	
	@PutMapping("/job/{jobId}")
	public void updateJob(@PathVariable String jobId, @RequestBody JobsEntity job) {
		jobsService.updateJob(jobId, job);
	}
	
	@DeleteMapping("/job/{jobId}")
	public void deleteJob(@PathVariable String jobId) {
		jobsService.deleteJob(jobId);
	}
	
	
}

package com.indra.bbva.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.indra.bbva.model.JobHistoryEntity;


public interface JobHistoryServices {


	public abstract List<JobHistoryEntity> getHistory(int id);
	public abstract void deleteHistory (int id);
	public abstract List<JobHistoryEntity> findByEmployeeIDAndSTART_DATE(int employee_id, String start_date);
	public abstract void deletejHistory(int employee_id, String start_date);
	
	
	public abstract List<JobHistoryEntity> getJobHistories();
	public abstract ResponseEntity<Object> createHistory(JobHistoryEntity history);
	public abstract void updateJobHistory (int id, JobHistoryEntity history);
	public abstract void deleteJobHistory (int id);
	
}

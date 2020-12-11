package com.indra.bbva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.JobsEntity;

@Repository
public interface JobRepository extends JpaRepository<JobsEntity, String> {

}

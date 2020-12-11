package com.indra.bbva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.DepartmentsEntity;

@Repository
public interface DepartmentsRepository extends JpaRepository<DepartmentsEntity, Integer>  {

}

package com.indra.bbva.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.EmployessEntity;

@Repository
public interface EmployessRepository extends JpaRepository<EmployessEntity, Integer> {


}




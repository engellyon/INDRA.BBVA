package com.indra.bbva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.RegionsEntity;
import com.indra.bbva.repository.RegionRepository;

@Service
public class RegionsServicesImp implements RegionsServices{

	@Autowired
	private RegionRepository repoRegion;
	
	public List<RegionsEntity> getRegions(){
		return repoRegion.findAll();
	}
	
	public ResponseEntity<Object> getRegion(int regionId){
		return new ResponseEntity<>(repoRegion.findById(regionId), HttpStatus.OK);
	}
	
	public ResponseEntity<Object> createRegion(RegionsEntity region){
		return new ResponseEntity<>(repoRegion.save(region), HttpStatus.OK);
	}
	
	public void updateRegion(int regionId, RegionsEntity region) {
		repoRegion.save(region);
	}
	
	public void deleteRegion(int regionId) {
		repoRegion.deleteById(regionId);
	}
	
}

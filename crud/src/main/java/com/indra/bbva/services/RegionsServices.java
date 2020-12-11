package com.indra.bbva.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.indra.bbva.model.RegionsEntity;

public interface RegionsServices {

	public abstract List<RegionsEntity> getRegions();
	public abstract ResponseEntity<Object> getRegion(int id);
	public abstract ResponseEntity<Object> createRegion(RegionsEntity region);
	public abstract void updateRegion (int id, RegionsEntity region);
	public abstract void deleteRegion (int id);
	
	
	
}

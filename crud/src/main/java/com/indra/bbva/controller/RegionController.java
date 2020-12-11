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

import com.indra.bbva.services.RegionsServices;
import com.indra.bbva.model.RegionsEntity;

@RestController
public class RegionController {

	@Autowired
	private RegionsServices regionService;
	
	
	@GetMapping("/regions")
	public List<RegionsEntity> getRegions(){
		return regionService.getRegions();
	}
	
	
	@GetMapping("/region/{regionId}")
	public ResponseEntity<Object> getRegion(@PathVariable int regionId){
		return regionService.getRegion(regionId);
	}
	
	@PostMapping("/region")
	public ResponseEntity<Object> createRegion(@RequestBody RegionsEntity region){
		return regionService.createRegion(region);
	}
	
	
	@PutMapping("/region/{regionId}")
	public void updateRegion(@PathVariable int regionId, @RequestBody RegionsEntity region) {
		regionService.updateRegion(regionId, region);
	}
	
	@DeleteMapping("/region/{regionId}")
	public void deleteRegion(@PathVariable int regionId) {
		regionService.deleteRegion(regionId);
	}
	
	
	
}

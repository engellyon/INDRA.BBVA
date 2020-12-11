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

import com.indra.bbva.model.LocationEntity;
import com.indra.bbva.services.LocationServices;

@RestController
public class LocationController {

	@Autowired 
	private LocationServices locationService;
	
	@GetMapping("/locations")
	public List<LocationEntity> getLocations(){
		return locationService.getLocations();
	}
	
	@GetMapping("/location/{locationId}")
	public ResponseEntity<Object> getLocation(@PathVariable int locationId){
		return locationService.getLocation(locationId);
	}
	
	@PostMapping("/location")
	public ResponseEntity<Object> createLocation(@RequestBody LocationEntity location){
		ResponseEntity<Object> saveLocation = locationService.createLocation(location);
		return null;
	}
	
	@PutMapping("/location/{locationId}")
	public void updateLocation(@PathVariable int locationId, @RequestBody LocationEntity location) {
		locationService.updateLocation(locationId, location);
	}
	
	@DeleteMapping("/location/{locationId}")
	public void deleteLocation(@PathVariable int locationId) {
		locationService.deleteLocation(locationId);
	}
	
	
	
}

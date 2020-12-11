package com.indra.bbva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.LocationEntity;
import com.indra.bbva.repository.LocationRepository;

@Service
public class LocationServicesImp implements LocationServices  {

	@Autowired
	private LocationRepository  repoLocation;
	
	public List<LocationEntity> getLocations(){
		return 	repoLocation.findAll();
	}
	
	public ResponseEntity<Object> getLocation(int locationId){
		return new ResponseEntity<>(repoLocation.findById(locationId), HttpStatus.OK);
	}
	
	public ResponseEntity<Object>  createLocation(LocationEntity location){
		return new ResponseEntity<>(repoLocation.save(location), HttpStatus.OK);
	}
	
	public void updateLocation(int locationId, LocationEntity location) {
		repoLocation.save(location);
	}
	
	public void deleteLocation(int locationId) {
		repoLocation.deleteById(locationId);
	}
	
}

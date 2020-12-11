package com.indra.bbva.services;


import java.util.List;

import org.springframework.http.ResponseEntity;
import com.indra.bbva.model.LocationEntity;

public interface LocationServices {
	
	public abstract List<LocationEntity> getLocations();
	public abstract ResponseEntity<Object> getLocation(int id);
	public abstract ResponseEntity<Object> createLocation(LocationEntity location);
	public abstract void updateLocation(int id, LocationEntity location);
	public abstract void deleteLocation(int id);
	
	

}

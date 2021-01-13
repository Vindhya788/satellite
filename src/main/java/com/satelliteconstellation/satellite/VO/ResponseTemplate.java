package com.satelliteconstellation.satellite.VO;

import com.satelliteconstellation.satellite.entity.Satellite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseTemplate {
	
	private Satellite satellite;
	private Location location;
	
	public void setSatellite(Satellite satellite) {
		// TODO Auto-generated method stub
		
	}
	public void setLocation(Location location) {
		// TODO Auto-generated method stub
		
	}

}

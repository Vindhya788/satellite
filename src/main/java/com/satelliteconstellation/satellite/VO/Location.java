package com.satelliteconstellation.satellite.VO;

import lombok.Data;

@Data
public class Location {
	
	private Long satelliteId;
    private String satelliteLocation;
    private String dateInLocation;

}

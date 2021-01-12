
package com.satelliteconstellation.satellite.repository;

import com.satelliteconstellation.satellite.entity.Satellite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SatelliteRepository extends CrudRepository<Satellite, Long>{

}
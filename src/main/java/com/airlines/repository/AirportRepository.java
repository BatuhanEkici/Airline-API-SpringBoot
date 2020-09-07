package com.airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long>{
	Airport findByName(String name);

}

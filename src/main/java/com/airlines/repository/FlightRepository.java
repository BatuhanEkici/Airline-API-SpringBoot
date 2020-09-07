package com.airlines.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.airlines.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

	@Query("select f from Flight f JOIN f.airline a where a.id = ?1 ")
	List<Flight> findFlightsByAirlineId(Long id);
	
	@Query("select f from Flight f JOIN f.route r where r.id = ?1 ")
	List<Flight> findFlightsByRouteId(Long id);
	
	
	}


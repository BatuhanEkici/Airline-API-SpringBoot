package com.airlines.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.airlines.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
	
	@Query("Select r from Route r where r.sourceAirportName = ?1")
	List<Route> findBySourceAirportName(String sourceAirportName);


}

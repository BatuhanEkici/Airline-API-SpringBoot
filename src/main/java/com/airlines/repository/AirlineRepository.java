package com.airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.model.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long>{
	Airline findByName(String name);
}

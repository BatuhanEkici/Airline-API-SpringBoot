package com.airlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines.model.Airport;
import com.airlines.repository.AirportRepository;

@Service
public class AirportService {
	
	@Autowired
	AirportRepository airportRepository;
	
	public Airport findByAirport(String name) {	
		return airportRepository.findByName(name);
	}
	
	public void addAirport(Airport airport) {
		airportRepository.save(airport);
	}
	
	public List<Airport> allAirportList() {
		return airportRepository.findAll();
		
	}

}

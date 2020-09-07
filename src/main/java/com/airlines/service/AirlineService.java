package com.airlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines.model.Airline;
import com.airlines.repository.AirlineRepository;

@Service
public class AirlineService {
	
	@Autowired
	AirlineRepository airlineRepository;
	
	public Airline findByAirline(String name) {	
		return airlineRepository.findByName(name);
	}
	
	
	public void addAirline(Airline airline) {
		airlineRepository.save(airline);	
	}


	public List<Airline> allAirlineList() {
		return airlineRepository.findAll();
		
	}
	
	

}

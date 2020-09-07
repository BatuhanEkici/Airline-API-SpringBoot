package com.airlines.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines.model.Flight;
import com.airlines.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	FlightRepository flightRepository;
	
	public void addFlight(Flight flight) {
		flightRepository.save(flight);
	}
	
	public List<Flight> allFlights(){
		return flightRepository.findAll();
	}
	
	public List<Flight> findFlightByAirlineId(Long id){
		return flightRepository.findFlightsByAirlineId(id);
	}
	
	public List<Flight> findFlightsByRouteId(Long id){
		return flightRepository.findFlightsByRouteId(id);
	}
	
	public Flight findFlightById(Long id) {
		 
		Flight flight = flightRepository.findById(id).get();
		return flight;
	}
	
	public Flight updateQuota(Flight flight , Integer newQuota) {
		int quota = (flight.getQuota()) - flight.getQuota()*(1/10);
		int counter = 0;
		while(quota > newQuota) {
			quota = quota- quota*(1/10);
			counter++;
		}
		
		double price = flight.getPrice();
		for(int i=0; i<counter; i++) {
			price = price + (price*(1/10));
		}
		flight.setPrice(price);
		flight.setQuota(newQuota);
		flightRepository.save(flight);
		return flight;
		
	}

}

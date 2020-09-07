package com.airlines.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.model.Flight;
import com.airlines.service.FlightService;

@RestController
@RequestMapping("/v1")
public class FlightController {

	@Autowired
	FlightService flightService;
	
	@PostMapping("/addFlight")
	public void addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}
	
	@GetMapping("/allFlights")
	public List<Flight> allFlights(){
		return flightService.allFlights();
	}
	
	@GetMapping("/findFlightByAirlineId/{id}")
	public List<Flight> findFlightByAirlineId(@PathVariable Long id){
		return flightService.findFlightByAirlineId(id);
	}
	
	@GetMapping("/findFlightsByRouteId/{id}")
	public List<Flight> findFlightsByRouteId(@PathVariable Long id){
		return flightService.findFlightsByRouteId(id);
	}
	
}

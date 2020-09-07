package com.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.model.Airport;
import com.airlines.service.AirportService;

@RestController
@RequestMapping("/v1")
public class AirportController {
	
	@Autowired
	AirportService airportService;
	
	@GetMapping("/findByAirport/{name}")
	public Airport findByAirport(@PathVariable String name) {
		return airportService.findByAirport(name);
	}
	
	@PostMapping("/addAirport")
	public void addAirport(@RequestBody Airport airport) {
		airportService.addAirport(airport);
	}
	
	@GetMapping("/allAirport")
	public List<Airport> allAirportList(){
		return airportService.allAirportList();
	}
	
}

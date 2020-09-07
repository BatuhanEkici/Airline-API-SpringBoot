package com.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.model.Airline;
import com.airlines.service.AirlineService;

@RestController
@RequestMapping("/v1")
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;
	
	@GetMapping("/findByAirline/{name}")
	public Airline findByAirline(@PathVariable String name) {
		return airlineService.findByAirline(name);
	}
	
	@PostMapping("/addAirline")
	public void addAirline(@RequestBody Airline airline) {
		airlineService.addAirline(airline);
	}
	
	@GetMapping("/allAirlines")
	public List<Airline> allAirlineList(){
		return airlineService.allAirlineList();
	}

}

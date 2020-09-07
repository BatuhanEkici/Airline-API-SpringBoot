package com.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.model.Route;
import com.airlines.service.RouteService;

@RestController
@RequestMapping("/v1")
public class RouteController {

	@Autowired
	RouteService routeService;
	
	@PostMapping("/addRoute")
	public void addRoute(@RequestBody Route route) {
		routeService.addRoute(route);
	}
	
	@GetMapping("/findBySourceAirportName/{name}")
	public List<Route> findBySourceAirportName(@PathVariable String name) {
		return routeService.findBySourceAirportName(name);
	}
	
	
	@GetMapping("/allRoutes")
	public List<Route> allRoutes(){
		return routeService.allRoutes();
	}
}

package com.airlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines.model.Route;
import com.airlines.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
	RouteRepository routeRepository;
	
	public void addRoute(Route route) {
		routeRepository.save(route);
	}
	
	public List<Route> findBySourceAirportName(String name) {
		return routeRepository.findBySourceAirportName(name);
	}
	
	
	public List<Route> allRoutes(){
		return routeRepository.findAll();
	}
}

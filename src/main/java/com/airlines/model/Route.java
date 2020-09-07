package com.airlines.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Route {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String sourceAirportName;
	
	private String destinationAirportName;
	
	
	@OneToMany(mappedBy= "route", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Flight> flights;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getSourceAirportName() {
		return sourceAirportName;
	}
	
	public void setSourceAirportName(String sourceAirportName) {
		this.sourceAirportName = sourceAirportName;
	}
	
	public String getDestinationAirportName() {
		return destinationAirportName;
	}
	
	public void setDestinationAirportName(String destinationAirportName) {
		this.destinationAirportName = destinationAirportName;
	}
	
	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "Route [id=" + id + ", sourceAirportName=" + sourceAirportName + ", destinationAirportName="
				+ destinationAirportName + ", flights=" + flights + "]";
	}

	
	
	
	
	
}

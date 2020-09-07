package com.airlines.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Ticket {
	@Id
	@GeneratedValue
	private long id;
	
	private String passangerName;
	
	private String passangerSurname;
		
	private String creditCart;
	
	private double price;
	
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "flight_id")
	private Flight flightss;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public String getPassangerSurname() {
		return passangerSurname;
	}

	public void setPassangerSurname(String passangerSurname) {
		this.passangerSurname = passangerSurname;
	}

	public String getCreditCart() {
		return creditCart;
	}

	public void setCreditCart(String creditCart) {
		this.creditCart = creditCart;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", passangerName=" + passangerName + ", passangerSurname=" + passangerSurname
				 + ", creditCart=" + creditCart + "]";
	}

	public Flight getFlightss() {
		return flightss;
	}

	public void setFlightss(Flight flightss) {
		this.flightss = flightss;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

	
	
	
}

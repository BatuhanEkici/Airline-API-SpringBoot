package com.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.model.Ticket;
import com.airlines.service.TicketService;

@RestController
@RequestMapping("/v1")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping("/addTicket")
	public void addTicket(@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
	}
	
	@GetMapping("/allTickets")
	public List<Ticket> allTickets(){
		return ticketService.allTickets();
	}
	
	@GetMapping("/findTicketById/{id}")
	public Ticket findTicketById(@PathVariable Long id) {
		return ticketService.findById(id);
	}
	
	@DeleteMapping("/cancelTicket/{id}")
	public void cancelTicket(@PathVariable Long id) {
		 ticketService.cancelTicket(id);
	}
	

}

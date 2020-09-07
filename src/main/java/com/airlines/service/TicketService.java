package com.airlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines.model.Ticket;
import com.airlines.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	TicketRepository ticketRepository;
	
	private String creditCartMasking(String ccMask) {
		 String cardNum = ccMask;
		 final int STARTLENGTH = 6;   
		 final int ENDLENGTH = 4; 
		 int maskedLength = cardNum.length() - (STARTLENGTH + ENDLENGTH);
		 StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < maskedLength; i++) {
		        sb.append("*");
		    }
		    String maskedCard = cardNum.substring(0, STARTLENGTH) + sb + cardNum.substring(cardNum.length() - ENDLENGTH, cardNum.length());
		    System.out.println(maskedCard);
		    return maskedCard;
	}
	
	
	public void addTicket(Ticket ticket) {
		String ccMask =ticket.getCreditCart();
		String maskedCardNumber = this.creditCartMasking(ccMask);
		ticket.setCreditCart(maskedCardNumber);
		ticketRepository.save(ticket);
	}
	
	public List<Ticket> allTickets(){
		return ticketRepository.findAll();
	}
	
	public Ticket findById(Long id) {
		return ticketRepository.getOne(id);
	}
	
	public void cancelTicket(Long id) {
		ticketRepository.deleteById(id);
	}

	
}

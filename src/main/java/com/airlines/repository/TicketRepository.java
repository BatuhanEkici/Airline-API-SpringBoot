package com.airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}

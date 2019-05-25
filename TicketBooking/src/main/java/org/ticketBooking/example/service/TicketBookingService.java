package org.ticketBooking.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ticketBooking.example.beans.Ticket;
import org.ticketBooking.example.repository.TicketBookingRepo;

@Service
public class TicketBookingService
{

	@Autowired
	TicketBookingRepo ticketBookingRepo;
	
	public Ticket createTicket(Ticket ticket)
	{
		return ticketBookingRepo.save(ticket);
	}

	public Ticket getTicketById(int id)
	{
		return ticketBookingRepo.findOne(id);
	}
	
	public Iterable<Ticket> getAllTickets()
	{
		return ticketBookingRepo.findAll();
	}

	public void deleteTicketId(int id)
	{
		ticketBookingRepo.delete(id);
	}

}

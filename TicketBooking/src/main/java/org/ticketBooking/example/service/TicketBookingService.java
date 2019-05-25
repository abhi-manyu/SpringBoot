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
	
	public Ticket updateTicketDetails(int tick_Id,Ticket ticket)
	{
		Ticket temp_Tick=ticketBookingRepo.findOne(tick_Id);
		if(temp_Tick!=null)
		{
			ticket.setTicket_Id(temp_Tick.getTicket_Id());
			temp_Tick=ticket;
			ticketBookingRepo.save(temp_Tick);
		}
		return ticket;
	}

	public Iterable<Ticket> deleteTicketId(int id)
	{
		ticketBookingRepo.delete(id);
		return ticketBookingRepo.findAll();
	}

}

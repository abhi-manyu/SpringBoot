package org.ticketBooking.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ticketBooking.example.beans.Ticket;
import org.ticketBooking.example.service.TicketBookingService;

@RestController
@RequestMapping(value="/tickets")
public class TicketBookingController
{
    @Autowired
    TicketBookingService bookingService;
    
    @PostMapping(value="/create")
    public Ticket cretaeTicket(@RequestBody Ticket t1)
    {
    	//Ticket t1=new Ticket(101,"Jira_Java_changes","Abhimanyu");
    	return bookingService.createTicket(t1);
    }
    
    @GetMapping(value="/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId")int id)
    {
    	return bookingService.getTicketById(id);
    }
    
    @GetMapping(value="/")
    public Iterable<Ticket> getAllTickets()
    {
    	return bookingService.getAllTickets();
    }
    
    @PutMapping(value="/{ticketId}")
    public Ticket updateTicketDetails(@PathVariable("ticketId")int id,
    		                          @RequestBody Ticket ticket)
    {
    	return bookingService.updateTicketDetails(id,ticket);
    }
    
    @DeleteMapping(value="/{ticketId}")
    public Iterable<Ticket> deleteTicket(@PathVariable("ticketId")int id)
    {
    	return bookingService.deleteTicketId(id);
    }
}

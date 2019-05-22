package org.springboot.example.controller;

import org.springboot.example.entity.Ticket;
import org.springboot.example.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/tickets")
public class TicketBookingController
{
    @Autowired
    private TicketBookingService bookingService;
    
    @PostMapping(value="/create")
    public Ticket createTicket(@RequestBody Ticket ticket)
    {
    	return bookingService.createTicket(ticket);
    }
    
    @GetMapping(value="/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId")int id)
    {
    	return bookingService.getTicketId(id);
    }
}

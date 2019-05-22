package org.springboot.example.service;

import org.springboot.example.dao.TicketBookingRepository;
import org.springboot.example.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService
{
   @Autowired
   private TicketBookingRepository bookRepo;

   public Ticket createTicket(Ticket ticket) 
   {
	  return bookRepo.save(ticket);
   }

  public Ticket getTicketId(int id)
   {
	  return bookRepo.findOne(id);
    }
   
}

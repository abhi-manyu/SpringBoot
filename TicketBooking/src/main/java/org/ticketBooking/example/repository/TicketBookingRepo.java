package org.ticketBooking.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.ticketBooking.example.beans.Ticket;

@Repository
public interface TicketBookingRepo extends CrudRepository<Ticket,Integer>
{

}

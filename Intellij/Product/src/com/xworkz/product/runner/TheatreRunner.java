package com.xworkz.product.runner;

import com.xworkz.product.rules.Theatre;
import com.xworkz.product.rules.TicketBooking;
import com.xworkz.product.rules.TicketBookingImpl;

public class TheatreRunner {
    public static void main(String[] args) {
        TicketBooking ticketBooking=new TicketBookingImpl();
        Theatre theatre=new Theatre(ticketBooking);
        theatre.sell(7);
        theatre.cancel();
    }
}

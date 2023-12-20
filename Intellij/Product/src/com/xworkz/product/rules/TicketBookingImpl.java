package com.xworkz.product.rules;

public class TicketBookingImpl implements TicketBooking{

    @Override
    public double buy(int quantity) {
        System.out.println("running buy in TicketBookingImpl");
        return 7;
    }

    @Override
    public boolean cancel() {
        System.out.println("running cancel in TicketBookingImpl");
        return false;
    }



}

package com.xworkz.product.rules;

public class Theatre {

    private TicketBooking ticketBooking;
    double price=200;

    public Theatre(TicketBooking ticketBooking){
        this.ticketBooking=ticketBooking;
    }
    public double sell(int quantity){

        double discount=price*quantity*0.1;
        double total=price*quantity;
        price=(price*quantity)-discount;

        if(quantity>5) {

           this.ticketBooking.buy(quantity);
            System.out.println("Total price is "+total);
            System.out.println("After discount the price is "+price);
        }
        else{
            System.err.println("there is no discount");
            System.out.println("total price is "+total);

        }

        return price;
    }
    public void cancel(){
        this.ticketBooking.cancel();
    }

}



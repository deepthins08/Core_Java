package com.xworkz.Classes;

public class Money {

    String type;
    int noOfNotes;
    int noOfCoins;


    public Money(){
        System.out.println("no arg cons in Money");
    }

    public void show(String type,int noOfNotes,int noOfCoins){
        this.type=type;
        this.noOfNotes=noOfNotes;
        this.noOfCoins=noOfCoins;
        System.out.println("Displaying show in Money");

    }

    @Override
    public String toString() {
        return "Money type is "+this.type+", no of Money notes is "+this.noOfNotes+", no of money coins is "+this.noOfCoins;
    }
}

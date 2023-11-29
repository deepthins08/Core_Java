package com.xworkz.Classes;

public class Chain {

    double length;
    String type;
    double cost;

    public Chain(){
        System.out.println("no arg cons in Chain");
    }

    public void show(String type,double cost,double length){
        this.type=type;
        this.cost=cost;
        this.length=length;
        System.out.println("Displaying show in Chain");

    }

    @Override
    public String toString() {
        return "Chain type is "+this.type+", Chain cost is "+this.cost+", Chain length is "+this.length;
    }
}

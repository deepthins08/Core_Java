package com.xworkz.Classes;

public class Spoon {

    int noOfSpoons;
    String type;
    double cost;


    public Spoon()
    {
        System.out.println("no arg cons in Spoon");
    }

    public void show(int noOfSpoons,String type,double cost){
        this.noOfSpoons=noOfSpoons;
        this.type=type;
        this.cost=cost;
        System.out.println("Displaying show in Spoon");

    }

    @Override
    public String toString() {
        return "no of Spoons are "+this.noOfSpoons+", spoon type is "+this.type+", spoon cost is "+this.cost;
    }
}

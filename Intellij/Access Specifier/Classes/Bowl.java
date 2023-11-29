package com.xworkz.Classes;

public class Bowl {

    String color;
    double weight;
    int noOfBowls;
    public Bowl()
    {
        System.out.println("no arg cons in Bowl");

    }

    public void show(String color,double weight,int noOfBowls){
        this.color=color;
        this.weight=weight;
        this.noOfBowls=noOfBowls;
        System.out.println("Displaying show in bowl");

    }

    @Override
    public String toString() {
        return "bowl color is "+this.color+", bowl weight is "+this.weight+", noofbowls are "+this.noOfBowls;
    }
}

package com.xworkz.Classes;

public class Bandli {

    int capacity;
    String type;
    String color;


    public Bandli(){
        System.out.println("no arg cons in Bandli");
    }

    public void show(int capacity,String type ,String color){
        this.capacity=capacity;
        this.type=type;
        this.color=color;
        System.out.println("Displaying show in Bandli");

    }

    @Override
    public String toString() {
        return "Bandli capacity is "+this.capacity+", Bandli type is "+this.type+", Bandli color is "+this.color;
    }
}

package com.xworkz.Classes;

public class Mic {

    String type;
    double cost;
    String brand;

    public Mic(){
        System.out.println("no arg cons in Mic");
    }

    public void show(String type,double cost,String brand){
        this.type=type;
        this.cost=cost;
        this.brand=brand;
        System.out.println("Displaying show in Mic");

    }

    @Override
    public String toString() {
        return "Mic type is "+this.type+", Mic cost is "+this.cost+", Mic brand is "+this.brand;
    }
}

package com.xworkz.Classes;

public class Cotton {

    String brand;
    double cost;
    String region;
    public Cotton(){

        System.out.println("created no arg const in Cotton");
    }

    public void show(String brand, double cost,String region){
        this.brand=brand;
        this.cost=cost;
        this.region=region;
        System.out.println("displaying show in Cotton");
    }


    @Override
    public String toString() {
        return "Cotton brand is :"+this.brand+", cost is :"+this.cost+", region is "+this.region;
    }
}

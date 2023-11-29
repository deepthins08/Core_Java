package com.xworkz.Classes;

public class Lens {
    int noOfLens;
    String brand;
    double cost;
    public Lens(){

        System.out.println("created no arg const in Lens");
    }

    public void show(String brand,int noOfLens, double cost){
        this.brand=brand;
        this.noOfLens=noOfLens;
        this.cost=cost;
        System.out.println("displaying show in Lens");
    }


    @Override
    public String toString() {
        return "lens brand is :"+this.brand+", noOfLens are :"+this.noOfLens+ ", cost is :"+this.cost;
    }
}

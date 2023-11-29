package com.xworkz.Classes;

public class Basket {

    String shape;
    String type;
    double cost;

    public Basket()
    {
        System.out.println("no arg cons in Basket");

    }

    public void show(String shape,String type,double cost){
        this.shape=shape;
        this.type=type;
        this.cost=cost;
        System.out.println("Displaying show in Basket");

    }

    @Override
    public String toString() {
        return "Basket shape is "+this.shape+", basket type is "+this.type+", basket cost is "+this.cost;
    }
}

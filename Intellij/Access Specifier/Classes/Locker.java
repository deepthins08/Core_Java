package com.xworkz.Classes;

import javax.xml.bind.SchemaOutputResolver;

public class Locker {

    String type;
    double cost;
    String brand;

    public Locker(){
        System.out.println("no arg cons in Locker");
    }

    public void show(String type,double cost,String brand){
        this.type=type;
        this.cost=cost;
        this.brand=brand;
        System.out.println("Displaying show in Locker");

    }

    @Override
    public String toString() {
        return "Locker type is "+this.type+", locker cost is "+this.cost+", Locker brand is "+this.brand;
    }
}

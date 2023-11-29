package com.xworkz.Classes;

public class Rice {

    String type;
    double cost;
    double inKg;

    public Rice(){
        System.out.println("no arg cons in Rice");
    }

    public void show(String type,double cost,int inKg){
        this.type=type;
        this.cost=cost;
        this.inKg=inKg;
        System.out.println("Displaying show in Rice");

    }

    @Override
    public String toString() {
        return "Rice Type is  "+this.type+", rice cost is  "+this.cost+", in kg  "+this.inKg;
    }
}

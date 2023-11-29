package com.xworkz.Classes;

public class Seed {

    String brand;
    int inKg;
    String name;

    public Seed(){
        System.out.println("no arg cons in Seed");
    }

    public void show(String name,String brand,int inKg){
        this.name=name;
        this.brand=brand;
        this.inKg=inKg;
        System.out.println("Displaying show in Seed");

    }

    @Override
    public String toString() {
        return "Seed name is  "+this.name+", seed brand is  "+this.brand+", in kg  "+this.inKg;
    }
}

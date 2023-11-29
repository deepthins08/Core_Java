package com.xworkz.Classes;

public class Heart {

    String bloodType;
    String personName;
    boolean isDiseased;

    public Heart(){
        System.out.println("no arg cons in Heart");
    }

    public void show(String bloodType,String personName,boolean isDiseased){
        this.bloodType=bloodType;
        this.personName=personName;
        this.isDiseased=isDiseased;
        System.out.println("Displaying show in Heart");

    }

    @Override
    public String toString() {
        return "Heart bloodtype is "+this.bloodType+", person name is  "+this.personName+", isdiseased heart "+this.isDiseased;
    }
}

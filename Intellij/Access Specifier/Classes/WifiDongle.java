package com.xworkz.Runner;

import com.xworkz.Classes.Guitar;

public class WifiDongle {

    String brand;
    double transferRate;
    int itemWeight;

    public WifiDongle(String brand,double transferRate,int itemWeight){
        this.brand=brand;
        this.transferRate=transferRate;
        this.itemWeight=itemWeight;
        System.out.println("Created String,double,int arg const in WifiDongle");
    }

    @Override
    public boolean equals(Object o) {

        WifiDongle wifiLeftSide=this;
        if(o!=null){

            if(o instanceof WifiDongle) {
                WifiDongle wifiRightSide=(WifiDongle) o;

                System.out.println("same on both side");

                if (wifiLeftSide.transferRate == wifiRightSide.transferRate && wifiLeftSide.itemWeight == wifiRightSide.itemWeight) {

                    System.out.println("wifileftside and wifirightside is same");
                    return true;
                } else {
                    System.err.println("wifileftside and wifirightside is not same");
                }
            }
        }
        else{
            System.err.println("null is passed");
        }

        return false;
    }

}

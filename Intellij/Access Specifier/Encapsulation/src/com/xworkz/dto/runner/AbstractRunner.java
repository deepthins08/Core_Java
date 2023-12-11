package com.xworkz.dto.runner;

import com.xworkz.dto.idea.*;

public class AbstractRunner {

    public static void main(String[] args) {
        System.out.println("Starting main in Abstract Runner");
        WayConstructing way=new WayConstructing();
        way.implement();
        way.constructing();

        BuyingLand buyingLand=new BuyingLand();
        buyingLand.buying();
        buyingLand.finding();

        Travelling travelling=new Travelling();
        travelling.planning();
        travelling.implementing();

        RecievedPackage recievedPackage=new RecievedPackage();
        recievedPackage.delivery();
        recievedPackage.packing();

        Developed developed=new Developed();
        developed.developing();
        developed.testing();


        System.out.println("Ending main in Abstract Runner");

    }
}

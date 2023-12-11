package com.xworkz.dto.idea;

public class RecievedPackage extends AbstractDeliveryPackage{

    @Override
    public void delivery() {
        System.out.println("running delivery in RecievedPackage");
    }
}

package com.xworkz.dto.idea;

public abstract class AbstractDeliveryPackage {

    public abstract void delivery();

    public void packing(){
        System.out.println("running packing in AbstractDeliveryPackage");
    }

}

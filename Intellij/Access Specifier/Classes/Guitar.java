package com.xworkz.Classes;

import java.util.Objects;

public class Guitar {
    int id;
    double price;
    String material;

    public Guitar(int id,double price,String material){
        this.id=id;
        this.price=price;
        this.material=material;
        System.out.println("Created id,price,material arg const in Guitar");
    }

    @Override
    public boolean equals(Object o) {

        Guitar leftSide=this;
        if(o!=null){

            if(o instanceof Guitar) {
                Guitar guitarRightSide=(Guitar) o;

                System.out.println("same on both side");

                if (leftSide.id == guitarRightSide.id && leftSide.price == guitarRightSide.price) {

                    System.out.println("leftside and guitarrightside is same");
                    return true;
                } else {
                    System.err.println("leftside and guitarrightside is not same");
                }
            }
        }
        else{
            System.err.println("null is passed");
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, material);
    }
}

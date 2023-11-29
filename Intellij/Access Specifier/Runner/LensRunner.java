package com.xworkz.Runner;

import com.xworkz.Classes.*;

public class LensRunner {

    public static void main(String... spec){

        System.out.println("Starting main in LensRunner");

        Lens lens=new Lens();
        lens.show("Lenskart",2,999);
        String ref = lens.toString();
        System.out.println(ref);

        Lens lens1=new Lens();
        lens1.show("Soft Eye",2,788);
        String ref1 = lens1.toString();
        System.out.println(ref1);

        Locker locker=new Locker();
        locker.show("Digital",30000,"LG");
        String ref2=locker.toString();
        System.out.println(ref2);

        Locker locker1=new Locker();
        locker1.show("Locking",12000,"Mindcraft");
        String ref3=locker1.toString();
        System.out.println(ref3);

        Cotton cotton=new Cotton();
        cotton.show("Kasturi Cotton",2000,"India");
        String ref4=cotton.toString();
        System.out.println(ref4);

        Cotton cotton1=new Cotton();
        cotton1.show("Arvind",5000,"India");
        String ref5=cotton1.toString();
        System.out.println(ref5);

        Mic mic=new Mic();
        mic.show("Microphone",2500,"Shure");
        String ref6 = mic.toString();
        System.out.println(ref6);

        Mic mic1=new Mic();
        mic1.show("Microphone",3000,"AKG");
        String ref7 = mic1.toString();
        System.out.println(ref7);

        Heart heart=new Heart();
        heart.show("AB+","Deepthi",false);
        String ref8=heart.toString();
        System.out.println(ref8);

        Heart heart1=new Heart();
        heart1.show("A+","Jasmin",true);
        String ref9=heart1.toString();
        System.out.println(ref9);

        Seed seed=new Seed();
        seed.show("Paddy","Venkateshwara",25);
        String ref10=seed.toString();
        System.out.println(ref10);

        Seed seed1=new Seed();
        seed1.show("Sunflower","Agro",30);
        String ref11=seed1.toString();
        System.out.println(ref11);

        Chain chain=new Chain();
        chain.show("twisted",300,9);
        String ref12=chain.toString();
        System.out.println(ref12);

        Chain chain1=new Chain();
        chain1.show("Straight",200,8);
        String ref13=chain1.toString();
        System.out.println(ref13);

        Rice rice=new Rice();
        rice.show("Steam rice",2000,50);
        String ref14=rice.toString();
        System.out.println(ref14);

        Rice rice1=new Rice();
        rice1.show("Sona rice",3000,50);
        String ref15=rice1.toString();
        System.out.println(ref15);

        Bowl bowl=new Bowl();
        bowl.show("white",6.3,2);
        String ref16=bowl.toString();
        System.out.println(ref16);

        Bowl bowl1=new Bowl();
        bowl1.show("pink",9,3);
        String ref17=bowl1.toString();
        System.out.println(ref17);

        Basket basket=new Basket();
        basket.show("Rounded","Wooden",500);
        String ref18=basket.toString();
        System.out.println(ref18);

        Basket basket1=new Basket();
        basket1.show("Square","Plastic",300);
        String ref19=basket1.toString();
        System.out.println(ref19);

        Bucket bucket=new Bucket();
        bucket.show(20,"Plastic",30);
        String ref20=bucket.toString();
        System.out.println(ref20);

        Bucket bucket1=new Bucket();
        bucket1.show(25,"Steel",40);
        String ref21=bucket1.toString();
        System.out.println(ref21);

        Geyser geyser=new Geyser();
        geyser.show("Vgaurd",5000,20);
        String ref22=geyser.toString();
        System.out.println(ref22);

        Geyser geyser1=new Geyser();
        geyser1.show("Crompton",7000,40);
        String ref23=geyser1.toString();
        System.out.println(ref23);

        Spoon spoon=new Spoon();
        spoon.show(6,"steel",300);
        String ref24=spoon.toString();
        System.out.println(ref24);

        Spoon spoon1=new Spoon();
        spoon1.show(12,"plastic",200);
        String ref25=spoon1.toString();
        System.out.println(ref25);

        Bandli bandli=new Bandli();
        bandli.show(20,"Steel","Silver");
        String ref26=bandli.toString();
        System.out.println(ref26);

        Bandli bandli1=new Bandli();
        bandli1.show(20,"Plastic","purple");
        String ref27=bandli1.toString();
        System.out.println(ref27);

        Money money=new Money();
        money.show("Rupee",10,5);
        String ref28=money.toString();
        System.out.println(ref28);

        Money money1=new Money();
        money1.show("Dollar",6,3);
        String ref29=money1.toString();
        System.out.println(ref29);

        System.out.println("Ending main in LensRunner");
    }
}

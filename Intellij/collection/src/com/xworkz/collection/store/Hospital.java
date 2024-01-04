package com.xworkz.collection.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospital {

    public static void main(String[] args) {

        Collection<String> hospital=new ArrayList<>();
        hospital.add("Jayadeva");
        hospital.add("Mercy Haven Medical Center");
        hospital.add("Sunrise General Hospital");
        hospital.add("Harmony Health Center SFO");
        hospital.add("Evergreen Wellness Hospital");
        hospital.add("Serenity Care Hospital");
        hospital.add("Crestview Regional Medical Center");
        hospital.add("Silver Springs Memorial Hospital");
        hospital.add("Unity Community Hospital");
        hospital.add("Hope Valley Medical Center");
        hospital.add("Radiant Life Hospital");
        hospital.add("Tranquil Meadows Medical Center");
        hospital.add("Beacon Health Plaza");
        hospital.add("Maple Grove Wellness Center");
        hospital.add("Oasis Medical Haven");
        hospital.add("Horizon View Hospital");
        hospital.add("Vitality Medical Institute");
        hospital.add("Crestwood Wellness Clinic sk");
        hospital.add("Pinecrest Regional Hospital");
        hospital.add("Graceful Care Hospital");

        Iterator<String> itr=hospital.iterator();
        while (itr.hasNext()){
            String ref=itr.next();
           // System.out.println("Hospital name is: "+ref);
            if(ref.toLowerCase().endsWith("o")){
                System.out.println(ref);
            }
            if(ref.endsWith("r")){
                System.out.println("ends with r "+ref);
            }
            if(ref.startsWith("b") || ref.endsWith("k")){
                System.out.println("Starting with b or end with k "+ref);
            }

            if(ref.length()<5) {
                System.out.println("having less than 5 characters "+ref);
            } else if (ref.length()>=5) {
                System.out.println("cutting of characters to length 5 "+ref.substring(0,5));
            }


        }

    }
}

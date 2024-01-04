package com.xworkz.collection.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStation {
    public static void main(String[] args) {
        Collection<String> radiostation=new ArrayList<>();
        radiostation.add("Radio Mirchi");
        radiostation.add("FM rainbow");
        radiostation.add("Radio City");
        radiostation.add("Radio one");
        radiostation.add("All talk");

        Iterator<String> itr=radiostation.iterator();
        while (itr.hasNext()){
            String ref=itr.next();
            System.out.println("Radio station name is :"+ref);

            if(ref.endsWith("i")){
                System.out.println("redio station is end with i is "+ref);
            }
            else{
                System.out.println("radio station do not consist i in end "+ref);
            }
        }
    }


}

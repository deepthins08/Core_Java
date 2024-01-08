package com.xworkz.collection.store;

import java.util.*;

public class Rainbow {

    public Collection<String> getColors(){

        Collection<String> rainbow=new ArrayList<>();
        rainbow.add("red");
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("blue");
        rainbow.add("indigo");
        rainbow.add("violet");
        System.out.println(rainbow.size());
        Iterator<String> itr= rainbow.iterator();
        while (itr.hasNext()){
            String ref=itr.next();
            System.out.println("Rainbow colors are "+ref);


        }
        rainbow.remove("violet");
        System.out.println("After removing count of colors is "+rainbow.size());
        Collection<String> collection1=new ArrayList<>();
        collection1.add("pink");
        collection1.add("green");


        System.out.println(rainbow.addAll(collection1));

        System.out.println(rainbow);
        System.out.println("After using addall the size is "+rainbow.size());
        collection1.add("white");
        System.out.println("After adding to the collection "+collection1);
        System.out.println("After adding to the collection but not to the rainbow "+rainbow);
        System.out.println("After removing all "+rainbow.removeAll(collection1));
        System.out.println(rainbow);
        System.out.println("using containsAll? "+rainbow.containsAll(rainbow));

        Object[] rainbow1=rainbow.toArray();
        System.out.println("Using toArray()");
        for(Object o: rainbow1) {
            System.out.println(o);
        }
        System.out.println("===============================================");

        Object[] rainbow2=new Object[rainbow.size()];
        rainbow2=rainbow.toArray(rainbow2);
        System.out.println("Using toArray(T[])");
        for(Object obj:rainbow2){
            System.out.println(obj);
        }
        System.out.println("is euqal?"+rainbow.equals("blue"));
        System.out.println("is contains? "+rainbow.contains("violet"));
        System.out.println(rainbow.removeAll(rainbow));
        System.out.println("after removing all "+rainbow);
        System.out.println("retain all "+rainbow.retainAll(rainbow));
        rainbow.clear();
        System.out.println("is empty? "+rainbow.isEmpty());

        return rainbow;

    }
}

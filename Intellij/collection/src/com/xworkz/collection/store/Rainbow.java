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
        boolean violet = Collections.addAll(rainbow, "violet");
       System.out.println(violet);
        System.out.println(rainbow);
        System.out.println("After using addall "+rainbow.size());
        System.out.println(rainbow.containsAll(rainbow));

        Object[] rainbow1=rainbow.toArray();
        System.out.println(Arrays.toString(rainbow1));

        System.out.println(rainbow.removeAll(rainbow));
        System.out.println("after removing all "+rainbow);
        System.out.println("retain all "+rainbow.retainAll(rainbow));
        rainbow.clear();
        System.out.println(rainbow.equals("blue"));
        System.out.println(rainbow.isEmpty());
        System.out.println(rainbow.contains("violet"));

        return rainbow;
    }
}

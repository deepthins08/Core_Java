package com.xworkz.mock.boot;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorInSet {
    public static void main(String[] args) {

        Set<String> laptop=new HashSet<>();
        laptop.add("Dell");
        laptop.add("Lenevo");
        laptop.add("Hp");
        laptop.add("Acer");
        laptop.add("Mac");

        Iterator<String> iterator= laptop.iterator();
        while(iterator.hasNext()){
            String result=iterator.next();
            System.out.println(result);
        }
    }
}

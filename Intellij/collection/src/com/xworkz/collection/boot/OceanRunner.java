package com.xworkz.collection.boot;

import com.xworkz.collection.comparator.OceanComparatorDesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanRunner {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("pacific");
        list.add("atlantic");
        list.add("indian");
        list.add("antarctic");
        list.add("arctic");
        list.add("north atlantic");
        list.add("south atlantic");
        list.add("north pacific");
        list.add("south pacific");
        list.add("south oceans");
        Collections.sort(list);
        System.out.println("Ascending order");
        for(String ref:list){
            System.out.println(ref);
        }

        Comparator<String> comparator=new OceanComparatorDesc();
        Collections.sort(list,comparator);
        System.out.println("Descending order");
        for(String ref:list){
            System.out.println(ref);
        }
    }
}

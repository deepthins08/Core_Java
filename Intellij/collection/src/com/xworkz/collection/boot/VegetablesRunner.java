package com.xworkz.collection.boot;

import com.xworkz.collection.comparator.VegetablesComparatorDesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VegetablesRunner {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("potato");
        list.add("drumstick");
        list.add("beans");
        list.add("lady finger");
        list.add("onion");
        list.add("tomato");
        list.add("carrot");
        list.add("beetroot");
        list.add("sweet potato");
        list.add("pea");

        Collections.sort(list);
        System.out.println("Ascending order");
        for(String ref:list){
            System.out.println(ref);
        }

        Comparator<String> comparator=new VegetablesComparatorDesc();
        Collections.sort(list,comparator);
        System.out.println("Descending order");
        for(String ref:list){
            System.out.println(ref);
        }
    }
}

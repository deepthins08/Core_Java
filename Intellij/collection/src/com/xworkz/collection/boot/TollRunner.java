package com.xworkz.collection.boot;

import com.xworkz.collection.comparator.TollComparatordesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollRunner {
    public static void main(String[] args) {

        List<Double> list=new ArrayList<>();
        list.add(200d);
        list.add(150d);
        list.add(300d);
        list.add(800d);
        list.add(640d);
        list.add(870d);
        list.add(2000d);
        list.add(922d);
        list.add(398d);
        list.add(1500d);

        Collections.sort(list);
        System.out.println("Ascending order");
        for(Double ref:list){
            System.out.println(ref);
        }

        Comparator<Double> comparator=new TollComparatordesc();
        Collections.sort(list,comparator);
        System.out.println("Descending order");
        for(Double ref:list){
            System.out.println(ref);
        }


    }
}

package com.xworkz.collection.boot;

import com.xworkz.collection.comparator.TreeComparatorDesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeRunner {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(1000);
        list.add(500);
        list.add(100);
        list.add(300);
        list.add(670);
        list.add(569);
        list.add(943);
        list.add(2000);
        list.add(490);
        list.add(900);
        Collections.sort(list);
        System.out.println("Ascending order");
        for(Integer ref: list){
            System.out.println(ref);
        }

        Comparator<Integer> comparator=new TreeComparatorDesc();
        Collections.sort(list,comparator);
        System.out.println("Descending order");
        for(Integer ref: list){
            System.out.println(ref);
        }

    }
}

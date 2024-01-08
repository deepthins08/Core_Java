package com.xworkz.collection.boot;

import com.xworkz.collection.comparator.SeedsComparatordesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeedsRunner {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("coriander");
        list.add("pumpkin");
        list.add("flax");
        list.add("sesame");
        list.add("poppy");
        list.add("sunflower");
        list.add("chia");
        list.add("basil");
        list.add("hemp");
        list.add("musk melon");
        Collections.sort(list);
        System.out.println("Ascending order");
        for (String ref: list) {
            System.out.println(ref);

        }

        Comparator<String> comparator=new SeedsComparatordesc();
        Collections.sort(list,comparator);
        System.out.println("Descending order");
        for (String ref: list) {
            System.out.println(ref);

        }


    }
}

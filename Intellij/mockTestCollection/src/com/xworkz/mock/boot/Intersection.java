package com.xworkz.mock.boot;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public static void main(String[] args) {

        List<String> sweets=new ArrayList<>();
        sweets.add("Jamun");
        sweets.add("Rasagulla");
        sweets.add("Badam Pista");
        sweets.add("Badusha");

        List<String> food=new ArrayList<>();
        food.add("Jamoon");
        food.add("Gobi");
        food.add("Badusha");
        food.add("Jilebi");

        List<String> intersect=new ArrayList<>();
        for(int i=0;i<sweets.size();i++) {
            if (food.contains(sweets.get(i))) {
                intersect.add(sweets.get(i));
            }
        }

        intersect.forEach(System.out::println);
    }
}

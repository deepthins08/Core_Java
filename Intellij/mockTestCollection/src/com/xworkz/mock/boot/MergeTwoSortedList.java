package com.xworkz.mock.boot;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {

    public static void main(String[] args) {

        List<String> tv=new ArrayList<>();
        tv.add("Onida");
        tv.add("LG");
        tv.add("Samsung");
        tv.add("Xiaomi");
        tv.add("Heir");

        tv.stream().sorted().forEach(System.out::println);

        List<String> tvCost=new ArrayList<>();
        tvCost.add("10000D");
        tvCost.add("25000D");
        tvCost.add("20000D");
        tvCost.add("30000D");
        tvCost.add("33000D");

        tvCost.stream().sorted().forEach(System.out::println);

       boolean result= tv.addAll(tvCost);
        System.out.println(result);

        tv.forEach(System.out::println);

    }
}

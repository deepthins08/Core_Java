package com.xworkz.mock.boot;

import java.util.HashSet;
import java.util.Set;

public class RemovingElementFromSet {
    public static void main(String[] args) {

        Set<String> cars=new HashSet<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Hundai");
        cars.add("Tata");
        cars.add("MG Astor");

        cars.forEach(System.out::println);
       boolean rm= cars.remove("Audi");
        System.out.println(rm);
        cars.forEach(System.out::println);


    }
}

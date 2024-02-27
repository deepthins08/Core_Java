package com.xworkz.map.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleTypeMapMethodsExample {

    public static void main(String[] args) {

        Map<String,Double> carAndPrice=new HashMap<>();
        carAndPrice.put("Honda",450000D);
        carAndPrice.put("Skoda",550000D);
        carAndPrice.put("Hyundai",780000D);
        carAndPrice.put("MG Astor",250000D);

        carAndPrice.values().forEach(System.out::println);
        carAndPrice.keySet().forEach(System.out::println);
       boolean contain= carAndPrice.containsKey("Skoda");
        System.out.println(contain);

        boolean containV=carAndPrice.containsValue(652D);
        System.out.println(containV);

       Set<Map.Entry<String,Double>> set= carAndPrice.entrySet();
       set.forEach(System.out::println);

       Double get=carAndPrice.get("Hyundai");
        System.out.println(get);

       int size= carAndPrice.size();
        System.out.println(size);

       boolean empty= carAndPrice.isEmpty();
        System.out.println(empty);

       carAndPrice.remove("Skoda");
        carAndPrice.forEach((k,l)-> System.out.println(k+": "+l));

        System.out.println("Map from another map");
        Map<String,Double> map1=new HashMap<>();
        map1.putAll(carAndPrice);
        map1.forEach((k,l)-> System.out.println(k+": "+l));
        System.out.println("after clear map1");
        map1.clear();
        map1.forEach((k,l)-> System.out.println(k+": "+l));
    }
}

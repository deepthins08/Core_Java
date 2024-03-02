package com.xworkz.mock.boot;

import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        Map<String,Double> clothesAndCost=new java.util.HashMap<>();
        clothesAndCost.put("Shirt",350D);
        clothesAndCost.put("Jeans",800D);
        clothesAndCost.put("Kurti",1700D);
        clothesAndCost.put("Frock",2000D);

        Set<Map.Entry<String,Double>> result =clothesAndCost.entrySet();
        result.forEach(System.out::println);
    }
}

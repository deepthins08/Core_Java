package com.xworkz.mock.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapKeyValue {

    public static void main(String[] args) {

        Map<String,Double> mobileAndPrice=new HashMap<>();
        mobileAndPrice.put("Redmi",12000D);
        mobileAndPrice.put("Iphone",180000D);
        mobileAndPrice.put("Poco",17000D);
        mobileAndPrice.put("OnePlus",25000D);
        Set<Map.Entry<String,Double>> result =mobileAndPrice.entrySet();
        result.forEach(System.out::println);

        if(mobileAndPrice.containsKey("Poco")){
            System.out.println(mobileAndPrice.get("Poco"));

        }
    }
}

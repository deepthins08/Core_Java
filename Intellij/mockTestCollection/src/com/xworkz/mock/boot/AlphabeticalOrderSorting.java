package com.xworkz.mock.boot;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticalOrderSorting {

    public static void main(String[] args) {

        List<String> mobile=new ArrayList<>();
        mobile.add("Redmi");
        mobile.add("Iphone");
        mobile.add("Poco");
        mobile.add("OnePLus");
        mobile.add("Realme");

        mobile.stream().sorted().forEach(System.out::println);
    }
}

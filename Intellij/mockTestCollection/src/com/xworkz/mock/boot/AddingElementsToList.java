package com.xworkz.mock.boot;

import java.util.ArrayList;
import java.util.List;

public class AddingElementsToList {
    public static void main(String[] args) {

        List<String> colors=new ArrayList<>();
        colors.add("pink");
        colors.add("purple");
        colors.add("black");
        colors.add("green");
        colors.add("gray");
        colors.add("yellow");

        colors.forEach(System.out::println);

    }
}

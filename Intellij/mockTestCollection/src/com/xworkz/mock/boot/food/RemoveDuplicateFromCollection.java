package com.xworkz.mock.boot.food;

import com.xworkz.mock.boot.food.FoodDTO;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromCollection {
    public static void main(String[] args) {

//        Collection<String> food=new ArrayList<>();
//
//        food.add("Gobi");
//        food.add("Maggi");
//        food.add("Dosa");
//        food.add("Biryani");
//        food.add("Idli");
//        food.add("Dosa");
//
//        food.forEach(System.out::println);
//        System.out.println("------------------------------------");
//        food.removeIf(Predicate.isEqual("Dosa"));
//        food.forEach(System.out::println);

        FoodDTO foodDTO=new FoodDTO("Gobi");
        FoodDTO foodDTO1=new FoodDTO("Maggi");
        FoodDTO foodDTO2=new FoodDTO("Dosa");
        FoodDTO foodDTO3=new FoodDTO("Biryani");
        FoodDTO foodDTO4=new FoodDTO("Idli");
        FoodDTO foodDTO5=new FoodDTO("Dosa");

        Set<FoodDTO> set=new HashSet<>();
        set.add(foodDTO);
        set.add(foodDTO1);
        set.add(foodDTO2);
        set.add(foodDTO3);
        set.add(foodDTO4);
        set.add(foodDTO5);

        set.forEach(System.out::println);
    }
}

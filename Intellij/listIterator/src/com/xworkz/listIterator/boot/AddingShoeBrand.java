package com.xworkz.listIterator.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AddingShoeBrand {

    public static void main(String[] args) {


        List<String> shoeBrands=new ArrayList<>();
        shoeBrands.add("puma");
        shoeBrands.add("adidas");
        shoeBrands.add("nyke");
        shoeBrands.add("wood land");
        shoeBrands.add("wild craft");
        shoeBrands.add("campus");
        shoeBrands.add("skechers");
        shoeBrands.add("alberto torresi");
        shoeBrands.add("asics");
        shoeBrands.add("brooks");

        ListIterator<String> listIterator= shoeBrands.listIterator();

        System.out.println("After adding");
        while(listIterator.hasNext()){
            String forward= listIterator.next();
            if("asics".equals(forward)){
                listIterator.add("new balance");
            }

        }

        shoeBrands.forEach(l-> System.out.println(l));
    }
}

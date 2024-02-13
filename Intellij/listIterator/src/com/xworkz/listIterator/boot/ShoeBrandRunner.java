package com.xworkz.listIterator.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ShoeBrandRunner {

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
       while(listIterator.hasNext()){
          String forward= listIterator.next();
           System.out.println(forward);
       }
        System.out.println("printing backward");
       while(listIterator.hasPrevious()){
           String backward= listIterator.previous();
           System.out.println(backward);
       }

        System.out.println("------------------------------------------------");

        ListIterator<String> list= shoeBrands.listIterator(2);
        while (list.hasNext()){
            String forwarding=list.next();
            System.out.println(forwarding);
        }
        System.out.println("------------------------------------------------");
        while (list.hasPrevious()){
            String forwarding=list.previous();
            System.out.println(forwarding);
        }
//

        System.out.println("after removing ");
        while(listIterator.hasNext()){
            String remove= listIterator.next();
            if("brroks".equals(remove)){

                listIterator.remove();
            }

        }

        shoeBrands.forEach(l-> System.out.println(l));


        System.out.println("Sorting by descending order");
        Collections.sort(shoeBrands,(p1,p2)->p2.compareTo(p1));
        shoeBrands.forEach(l-> System.out.println(l));



    }
}

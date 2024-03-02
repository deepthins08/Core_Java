package com.xworkz.mock.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IntegerOperations {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(123);
        list.add(53);
        list.add(22);

        ListIterator<Integer> listIterator= list.listIterator();
        while (listIterator.hasNext()){
           Integer result=listIterator.next();
            if(result.equals(123)){
                listIterator.add(27);
            }


        }

        ListIterator<Integer> listIterator1=list.listIterator();
        while (listIterator1.hasNext()){
            Integer result1=listIterator1.next();
            if (result1 % 2 == 0) {
                listIterator1.remove();
            }
        }
        list.forEach(System.out::println);
    }
}

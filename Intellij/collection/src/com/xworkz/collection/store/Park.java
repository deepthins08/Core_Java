package com.xworkz.collection.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Park {

    public static void main(String[] args) {

        Collection<Integer> park=new ArrayList<>();
        park.add(30);
        park.add(20);
        park.add(40);
        park.add(35);
        park.add(56);
        park.add(95);
        park.add(74);
        park.add(82);
        park.add(29);
        park.add(63);
        park.add(95);
        park.add(46);
        park.add(35);
        park.add(78);
        park.add(67);
        park.add(59);
        park.add(71);
        park.add(88);
        park.add(35);
        park.add(19);
        park.add(37);
        park.add(45);
        park.add(55);
        park.add(37);
        park.add(98);
        park.add(75);
        park.add(49);
        park.add(34);
        park.add(85);
        park.add(90);
        park.add(78);
        park.add(64);
        park.add(37);
        park.add(68);
        park.add(120);
        park.add(23);
        park.add(115);
        park.add(73);
        park.add(89);
        park.add(37);
        park.add(41);
        park.add(83);
        park.add(38);
        park.add(25);
        park.add(93);
        park.add(66);
        park.add(54);
        park.add(49);
        park.add(55);
        park.add(86);
        park.add(76);
        park.add(39);
        park.add(44);
        park.add(66);
        park.add(51);
        park.add(110);
        park.add(38);
        park.add(83);
        park.add(77);
        park.add(58);

        Iterator<Integer> itr=park.iterator();
        while (itr.hasNext()){
            Integer ref= itr.next();
            System.out.println("no' of trees in the park are "+ref);


        }
    }
}

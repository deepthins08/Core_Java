package com.xworkz.listIterator.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CampingItems {

    public static void main(String[] args) {

        List<String> itemsList=new ArrayList<>();
        itemsList.add("Sleeping Bag");
        itemsList.add("Camp Chairs");
        itemsList.add("Stove");
        itemsList.add("Lantern");
        itemsList.add("Camping Table");
        itemsList.add("Tent");
        itemsList.add("Tarp");
        itemsList.add("Hammock");
        itemsList.add("Pillow");
        itemsList.add("HeadLamps");

        itemsList.stream().filter(l->l.contains("t")).forEach(p-> System.out.println(p));
        System.out.println("sorted in descending order");
        itemsList.stream().sorted((p1,p2)->p2.compareTo(p1)).forEach(e-> System.out.println(e));
        System.out.println("items having at least 5 characters and printing in descending order");
        itemsList.stream().filter(l->l.length()>=5).sorted((p1,p2)->p2.compareTo(p1)).forEach(p-> System.out.println(p));
        System.out.println("converting uppercase");
        itemsList.stream().filter(l->l.contains("a")).map(u->u.toUpperCase()).collect(Collectors.toSet()).forEach(e-> System.out.println(e));
        System.out.println("items having l character count");
      long count=  itemsList.stream().filter(l-> l.contains("l")).count();
        System.out.println(count);
        System.out.println("sorted list in ascending ");
        itemsList.stream().filter(l->l.contains("a")&& l.contains("o")).sorted().forEach(e-> System.out.println(e));


    }
}

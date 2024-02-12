package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.WatchDTO;
import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {

        WatchDTO watchDTO=new WatchDTO("Vintage",1695,"digital",true);
        WatchDTO watchDTO1=new WatchDTO("Titan",2156,"analog",true);
        WatchDTO watchDTO2=new WatchDTO("Quantum",17475,"analog",true);
        WatchDTO watchDTO3=new WatchDTO("Van Huesen",2558,"analog",true);
        WatchDTO watchDTO4=new WatchDTO("Lime Stone",280,"analog",false);

        List<WatchDTO> list=new ArrayList<>();
        list.add(watchDTO);
        list.add(watchDTO1);
        list.add(watchDTO2);
        list.add(watchDTO3);
        list.add(watchDTO4);

       Collections.sort(list);
        list.forEach(l-> System.out.println(l));
        System.out.println("---------------------------------------------");
       // Comparator<WatchDTO> watchDTOComparator=(p1,p2)->p1.getBrand().compareTo(p2.getBrand());
        System.out.println("ascenidng by brand");
        Collections.sort(list,(p1,p2)->p1.getBrand().compareTo(p2.getBrand()));
        list.forEach(l-> System.out.println(l));
        System.out.println("descending by type");
        Collections.sort(list,(p1,p2)->p2.getBrand().compareTo(p1.getBrand()));
        list.forEach(l-> System.out.println(l));
        System.out.println("ascenidng by type");
        Collections.sort(list,(p1,p2)->p1.getType().compareTo(p2.getType()));
        list.forEach(l-> System.out.println(l));
        System.out.println("descending by type");
        Collections.sort(list,(p1,p2)->p2.getType().compareTo(p1.getType()));
        list.forEach(l-> System.out.println(l));
        System.out.println("ascenidng by waterResistance");
        Collections.sort(list,(p1,p2)->Boolean.compare(p1.isWaterResistance(),p2.isWaterResistance()));
        list.forEach(l-> System.out.println(l));
        System.out.println("descending by waterResistance");
        Collections.sort(list,(p1,p2)->Boolean.compare(p2.isWaterResistance(),p2.isWaterResistance()));
        list.forEach(l-> System.out.println(l));

    }
}

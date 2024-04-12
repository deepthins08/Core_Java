package com.xworkz.stream.boot;

import com.xworkz.stream.dto.EquipmentsDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EquipmentsRunner {

    public static void main(String[] args) {

        EquipmentsDTO equipmentsDTO=new EquipmentsDTO("Syringe","plastic",100);
        EquipmentsDTO equipmentsDTO1=new EquipmentsDTO("Ventilator","glass",10000);
        EquipmentsDTO equipmentsDTO2=new EquipmentsDTO("Surgical Tables","Metal",5000);

        List<EquipmentsDTO> list=new ArrayList<>();
        list.add(equipmentsDTO);
        list.add(equipmentsDTO1);
        list.add(equipmentsDTO2);

        list.forEach(l-> System.out.println(l));

        System.out.println("after sorting based on price");
        list.stream().sorted((p1,p2)->Double.compare(p1.getPrice(), p2.getPrice())).forEach(l-> System.out.println(l));
        System.out.println("after sorting descending order based on price");
        list.stream().sorted((p1,p2)->Double.compare(p2.getPrice(),p1.getPrice())).forEach(l-> System.out.println(l));

        System.out.println("--------------------------------------------");
        System.out.println("filtering price using map and filter in stream()");
      List<Double> equipmentsDTOS=  list.stream().map(EquipmentsDTO::getPrice).
                filter(price->price.doubleValue()<10000).collect(Collectors.toList());
      equipmentsDTOS.forEach(l-> System.out.println(l));




    }
}

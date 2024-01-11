package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.GeyserDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeyserRunner {
    public static void main(String[] args) {

        GeyserDTO geyserDTO=new GeyserDTO("bajaj","white",6199,15);
        GeyserDTO geyserDTO1=new GeyserDTO("vgaurd","black",7599,15);
        GeyserDTO geyserDTO2=new GeyserDTO("kensar","blue",6299,14);
        GeyserDTO geyserDTO3=new GeyserDTO("crompton","gray",5899,16);
        GeyserDTO geyserDTO4=new GeyserDTO("wallpool","brown",7899,18);

        List<GeyserDTO> list=new ArrayList<>();
        list.add(geyserDTO);
        list.add(geyserDTO1);
        list.add(geyserDTO2);
        list.add(geyserDTO3);
        list.add(geyserDTO4);

        System.out.println("Ascending by brand");
        Comparator<GeyserDTO> geyserDTOComparatorBrandAsce=(o1,o2)->{
          return o1.getBrand().compareTo(o2.getBrand());
        };
        Collections.sort(list,geyserDTOComparatorBrandAsce);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descendiong by brand");
        Comparator<GeyserDTO> geyserDTOComparatorBrandDesc=(o1,o2)->{
            return o2.getBrand().compareTo(o1.getBrand());
        };
        Collections.sort(list,geyserDTOComparatorBrandDesc);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by color");
        Comparator<GeyserDTO> geyserDTOComparatorColorAsce=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,geyserDTOComparatorColorAsce);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by color");
        Comparator<GeyserDTO> geyserDTOComparatorColorDesc=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,geyserDTOComparatorColorDesc);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by cost");
        Comparator<GeyserDTO> geyserDTOComparatorCostAsce=(o1,o2)->{
            return Double.compare(o1.getCost(),o2.getCost());
        };
        Collections.sort(list,geyserDTOComparatorCostAsce);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("descending by cost");
        Comparator<GeyserDTO> geyserDTOComparatorCostDesc=(o1,o2)->{
            return Double.compare(o1.getCost(),o1.getCost());
        };
        Collections.sort(list,geyserDTOComparatorCostDesc);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by capacity");
        Comparator<GeyserDTO> geyserDTOComparatorCapacityAsce=(o1,o2)->{
            return Integer.compare(o1.getCapacity(),o2.getCapacity());
        };
        Collections.sort(list,geyserDTOComparatorCapacityAsce);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by capacity");
        Comparator<GeyserDTO> geyserDTOComparatorCapacityDesc=(o1,o2)->{
            return Integer.compare(o2.getCapacity(),o2.getCapacity());
        };
        Collections.sort(list,geyserDTOComparatorCapacityDesc);
        for(GeyserDTO dto:list){
            System.out.println(dto);
        }


    }
}

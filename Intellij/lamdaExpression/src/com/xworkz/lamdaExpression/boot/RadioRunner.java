package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.RadioDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RadioRunner {
    public static void main(String[] args) {

        RadioDTO radioDTO=new RadioDTO("philips","black",1499,1);
        RadioDTO radioDTO1=new RadioDTO("panasonic","green",1422,1);
        RadioDTO radioDTO2=new RadioDTO("igear","black",2499,1);
        RadioDTO radioDTO3=new RadioDTO("sony","white",3857,1);
        RadioDTO radioDTO4=new RadioDTO("crompton","yellow",3556,2);

        List<RadioDTO> list=new ArrayList<>();
        list.add(radioDTO);
        list.add(radioDTO1);
        list.add(radioDTO2);
        list.add(radioDTO3);
        list.add(radioDTO4);

        System.out.println("Ascending by brand");
        Comparator<RadioDTO> radioDTOComparatorBrandAsce=(o1,o2)->{
          return o1.getBrand().compareTo(o2.getBrand());
        };
        Collections.sort(list,radioDTOComparatorBrandAsce);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by brand");
        Comparator<RadioDTO> radioDTOComparatorBrandDesc=(o1,o2)->{
            return o2.getBrand().compareTo(o1.getBrand());
        };
        Collections.sort(list,radioDTOComparatorBrandDesc);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by color");
        Comparator<RadioDTO> radioDTOComparatorColorAsce=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,radioDTOComparatorColorAsce);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by color");
        Comparator<RadioDTO> radioDTOComparatorColorDesc=(o1,o2)->{
            return o2.getColor().compareTo(o1.getColor());
        };
        Collections.sort(list,radioDTOComparatorColorDesc);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by cost");
        Comparator<RadioDTO> radioDTOComparatorCostAsce=(o1,o2)->{
            return Double.compare(o1.getCost(), o2.getCost());
        };
        Collections.sort(list,radioDTOComparatorCostAsce);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by cost");
        Comparator<RadioDTO> radioDTOComparatorCostDesc=(o1,o2)->{
            return Double.compare(o2.getCost(), o1.getCost());
        };
        Collections.sort(list,radioDTOComparatorCostDesc);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by quantity");
        Comparator<RadioDTO> radioDTOComparatorQuantityAsce=(o1,o2)->{
            return Integer.compare(o1.getQuantity(), o2.getQuantity());
        };
        Collections.sort(list,radioDTOComparatorQuantityAsce);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by cost");
        Comparator<RadioDTO> radioDTOComparatorQuantityDesc=(o1,o2)->{
            return Integer.compare(o2.getQuantity(), o1.getQuantity());
        };
        Collections.sort(list,radioDTOComparatorQuantityDesc);
        for(RadioDTO dto:list){
            System.out.println(dto);
        }


    }
}

package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.ThermometerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThermometerRunner {

    public static void main(String[] args) {

        ThermometerDTO thermometerDTO=new ThermometerDTO(190,"white","galss",100);
        ThermometerDTO thermometerDTO1=new ThermometerDTO(250,"blue","battery",200);
        ThermometerDTO thermometerDTO2=new ThermometerDTO(500,"white","glass",200);
        ThermometerDTO thermometerDTO3=new ThermometerDTO(350,"pink","battery",150);
        ThermometerDTO thermometerDTO4=new ThermometerDTO(99,"white","glass",120);

        List<ThermometerDTO> list=new ArrayList<>();
        list.add(thermometerDTO);
        list.add(thermometerDTO1);
        list.add(thermometerDTO2);
        list.add(thermometerDTO3);
        list.add(thermometerDTO4);

        System.out.println("Ascending by Cost");
        Comparator<ThermometerDTO> thermometerDTOComparatorCostAsce=(o1,o2)->{
          return Double.compare(o1.getCost(),o2.getCost());
        };
        Collections.sort(list,thermometerDTOComparatorCostAsce);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by Cost");
        Comparator<ThermometerDTO> thermometerDTOComparatorCostDesc=(o1,o2)->{
            return Double.compare(o2.getCost(),o1.getCost());
        };
        Collections.sort(list,thermometerDTOComparatorCostDesc);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by color");
        Comparator<ThermometerDTO> thermometerDTOComparatorColorAsce=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,thermometerDTOComparatorColorAsce);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by color");
        Comparator<ThermometerDTO> thermometerDTOComparatorColorDesc=(o1,o2)->{
            return o2.getColor().compareTo(o1.getColor());
        };
        Collections.sort(list,thermometerDTOComparatorColorDesc);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending by type");
        Comparator<ThermometerDTO> thermometerDTOComparatorTypeAsce=(o1,o2)->{
            return o1.getType().compareTo(o2.getType());
        };
        Collections.sort(list,thermometerDTOComparatorTypeAsce);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by color");
        Comparator<ThermometerDTO> thermometerDTOComparatorTypeDesc=(o1,o2)->{
            return o2.getType().compareTo(o1.getType());
        };
        Collections.sort(list,thermometerDTOComparatorTypeDesc);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by maxtemp");
        Comparator<ThermometerDTO> thermometerDTOComparatorMaxTempAsce=(o1,o2)->{
            return Integer.compare(o1.getMaxtemp(),o2.getMaxtemp());
        };
        Collections.sort(list,thermometerDTOComparatorMaxTempAsce);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by maxtemp");
        Comparator<ThermometerDTO> thermometerDTOComparatorMaxTempDesc=(o1,o2)->{
            return Integer.compare(o2.getMaxtemp(),o1.getMaxtemp());
        };
        Collections.sort(list,thermometerDTOComparatorMaxTempDesc);
        for(ThermometerDTO dto:list){
            System.out.println(dto);
        }



    }
}

package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.EscalatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EscalatorRunner {
    public static void main(String[] args) {

        EscalatorDTO escalatorDTO=new EscalatorDTO(20,true,"vegacity mall","black");
        EscalatorDTO escalatorDTO1=new EscalatorDTO(30,true,"forum mall","gray");
        EscalatorDTO escalatorDTO2=new EscalatorDTO(25,true,"railway station","black");
        EscalatorDTO escalatorDTO3=new EscalatorDTO(20,true,"metro station","gray");
        EscalatorDTO escalatorDTO4=new EscalatorDTO(25,true,"orion mall","black");

        List<EscalatorDTO> list=new ArrayList<>();
        list.add(escalatorDTO);
        list.add(escalatorDTO1);
        list.add(escalatorDTO2);
        list.add(escalatorDTO3);
        list.add(escalatorDTO4);

        System.out.println("Ascending by noofstairs");
        Comparator<EscalatorDTO> escalatorDTOComparatorNoOfStairsAsce=(o1,o2)->{
          return Integer.compare(o1.getNoOfStairs(),o2.getNoOfStairs());
        };
        Collections.sort(list,escalatorDTOComparatorNoOfStairsAsce);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by noofstairs");
        Comparator<EscalatorDTO> escalatorDTOComparatorNoOfStairsDesc=(o1,o2)->{
            return Integer.compare(o2.getNoOfStairs(),o1.getNoOfStairs());
        };
        Collections.sort(list,escalatorDTOComparatorNoOfStairsDesc);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by electric");
        Comparator<EscalatorDTO> escalatorDTOComparatorElectricAsce=(o1,o2)->{
            return Boolean.compare(o1.isElectric(),o2.isElectric());
        };
        Collections.sort(list,escalatorDTOComparatorElectricAsce);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by electric");
        Comparator<EscalatorDTO> escalatorDTOComparatorElectricDesc=(o1,o2)->{
            return Boolean.compare(o2.isElectric(),o1.isElectric());
        };
        Collections.sort(list,escalatorDTOComparatorElectricDesc);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by place");
        Comparator<EscalatorDTO> escalatorDTOComparatorPlaceAsce=(o1,o2)->{
            return o1.getPlace().compareTo(o2.getPlace());
        };
        Collections.sort(list,escalatorDTOComparatorPlaceAsce);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by place");
        Comparator<EscalatorDTO> escalatorDTOComparatorPlaceDesc=(o1,o2)->{
            return o2.getPlace().compareTo(o1.getPlace());
        };
        Collections.sort(list,escalatorDTOComparatorPlaceDesc);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by color");
        Comparator<EscalatorDTO> escalatorDTOComparatorColorAsce=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,escalatorDTOComparatorColorAsce);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by color");
        Comparator<EscalatorDTO> escalatorDTOComparatorColorDesc=(o1,o2)->{
            return o2.getColor().compareTo(o1.getColor());
        };
        Collections.sort(list,escalatorDTOComparatorColorDesc);
        for (EscalatorDTO dto:list){
            System.out.println(dto);
        }


    }
}

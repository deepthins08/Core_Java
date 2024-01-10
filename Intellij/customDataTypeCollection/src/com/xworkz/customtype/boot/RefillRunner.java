package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.RefillDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefillRunner {
    public static void main(String[] args) {

        RefillDTO refillDTO=new RefillDTO("parker",72,1,"blue");
        RefillDTO refillDTO1=new RefillDTO("Reynolds",497,20,"black");
        RefillDTO refillDTO2=new RefillDTO("montex",151,10,"blue");
        RefillDTO refillDTO3=new RefillDTO("rorito",549,5,"black");
        RefillDTO refillDTO4=new RefillDTO("pentonoic",480,60,"blue");
        List<RefillDTO> list=new ArrayList<>();
        list.add(refillDTO);
        list.add(refillDTO1);
        list.add(refillDTO2);
        list.add(refillDTO3);
        list.add(refillDTO4);

        for(RefillDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order in Cost");
        Comparator<RefillDTO> comparator=new RefillCostComparatorAsce();
        Collections.sort(list,comparator);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in Cost");
        Comparator<RefillDTO> comparator1=new RefillCostComparatorDesc();
        Collections.sort(list,comparator1);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in brand");
        Comparator<RefillDTO> comparator2=new RefillBrandComparatorAsce();
        Collections.sort(list,comparator2);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in brand");
        Comparator<RefillDTO> comparator3=new RefillBrandComparatorDesc();
        Collections.sort(list,comparator3);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in color");
        Comparator<RefillDTO> comparator4=new RefillColorComparatorAsce();
        Collections.sort(list,comparator4);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in color");
        Comparator<RefillDTO> comparator5=new RefillColorComparatorDesc();
        Collections.sort(list,comparator5);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }


        System.out.println("Ascending order in quantity");
        Comparator<RefillDTO> comparator6=new RefillQuantityComparatorAsce();
        Collections.sort(list,comparator6);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in quantity");
        Comparator<RefillDTO> comparator7=new RefillQuantityComparatorDesc();
        Collections.sort(list,comparator7);
        for(RefillDTO dto:list){
            System.out.println(dto);
        }


    }
}

package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.WaterPurifierDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierRunner {
    public static void main(String[] args) {

        WaterPurifierDTO waterPurifierDTO=new WaterPurifierDTO("pureit","white",13000,15);
        WaterPurifierDTO waterPurifierDTO1=new WaterPurifierDTO("aquapure","blue",3799,10);
        WaterPurifierDTO waterPurifierDTO2=new WaterPurifierDTO("aqua fresh","black",3499,12);
        WaterPurifierDTO waterPurifierDTO3=new WaterPurifierDTO("kinsco aqua","gold",4999,10);
        WaterPurifierDTO waterPurifierDTO4=new WaterPurifierDTO("blue satar","black",12000,15);
        List<WaterPurifierDTO> list=new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);
        list.add(waterPurifierDTO4);

        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in capacity");
        Comparator<WaterPurifierDTO> comparator=new WaterPurifierCapacityComparatorAsc();
        Collections.sort(list,comparator);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in capacity");
        Comparator<WaterPurifierDTO> comparator1=new WaterPurifierCapacityComparatorDesc();
        Collections.sort(list,comparator1);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order in color");
        Comparator<WaterPurifierDTO> comparator2=new WaterPurifierColorComparatorAsc();
        Collections.sort(list,comparator2);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending order in color");
        Comparator<WaterPurifierDTO> comparator3=new WaterPurifierColorComparatorDesc();
        Collections.sort(list,comparator3);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in cost");
        Comparator<WaterPurifierDTO> comparator4=new WaterPurifierCostComparatorAsc();
        Collections.sort(list,comparator4);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending order in cost");
        Comparator<WaterPurifierDTO> comparator5=new WaterPurifierCostComparatorDesc();
        Collections.sort(list,comparator5);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order in Name");
        Comparator<WaterPurifierDTO> comparator6=new WaterPurifierNameComparatorAsc();
        Collections.sort(list,comparator6);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending order in Name");
        Comparator<WaterPurifierDTO> comparator7=new WaterPurifierNameComparatorDesc();
        Collections.sort(list,comparator7);
        for(WaterPurifierDTO dto:list){
            System.out.println(dto);
        }
    }
}

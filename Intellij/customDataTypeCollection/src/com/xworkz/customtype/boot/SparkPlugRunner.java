package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.SparkPlugDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugRunner {
    public static void main(String[] args) {

        SparkPlugDTO sparkPlugDTO=new SparkPlugDTO("chalitam",196,"copper",1);
        SparkPlugDTO sparkPlugDTO1=new SparkPlugDTO("autoplex",296,"Copper",1);
        SparkPlugDTO sparkPlugDTO2=new SparkPlugDTO("minda",92,"iron",1);
        SparkPlugDTO sparkPlugDTO3=new SparkPlugDTO("road religion",899,"platinum",2);
        SparkPlugDTO sparkPlugDTO4=new SparkPlugDTO("greygator",147,"copper",1);

        List<SparkPlugDTO> list=new ArrayList<>();
        list.add(sparkPlugDTO);
        list.add(sparkPlugDTO1);
        list.add(sparkPlugDTO2);
        list.add(sparkPlugDTO3);
        list.add(sparkPlugDTO4);

        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in brand");
        Comparator<SparkPlugDTO> comparator=new SparkPlugBrandComparatorAsce();
        Collections.sort(list,comparator);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in brand");
        Comparator<SparkPlugDTO> comparator1=new SparkPlugBrandComparatorDesc();
        Collections.sort(list,comparator1);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order in cost");
        Comparator<SparkPlugDTO> comparator2=new SparkPlugCostComparatorAsce();
        Collections.sort(list,comparator2);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in cost");
        Comparator<SparkPlugDTO> comparator3=new SparkPlugCostComparatorDesc();
        Collections.sort(list,comparator3);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in quantity ");
        Comparator<SparkPlugDTO> comparator4=new SparkPlugQuantityComparatorAsce();
        Collections.sort(list,comparator4);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending order in quantity");
        Comparator<SparkPlugDTO> comparator5=new SparkPlugQuantityComparatorDesc();
        Collections.sort(list,comparator5);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order in type");
        Comparator<SparkPlugDTO> comparator6=new SparkPlugTypeComparatorAsce();
        Collections.sort(list,comparator6);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in type");
        Comparator<SparkPlugDTO> comparator7=new SparkPlugTypeComparatorDesc();
        Collections.sort(list,comparator7);
        for(SparkPlugDTO dto:list){
            System.out.println(dto);
        }


    }
}

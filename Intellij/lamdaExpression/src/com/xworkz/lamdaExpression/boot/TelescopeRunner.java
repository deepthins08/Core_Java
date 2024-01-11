package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.TelescopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelescopeRunner {
    public static void main(String[] args) {

        TelescopeDTO telescopeDTO=new TelescopeDTO(20,2,"gold",2000);
        TelescopeDTO telescopeDTO1=new TelescopeDTO(10,1,"black",2500);
        TelescopeDTO telescopeDTO2=new TelescopeDTO(12,1.5,"gray",1000);
        TelescopeDTO telescopeDTO3=new TelescopeDTO(15,3,"green",1200);
        TelescopeDTO telescopeDTO4=new TelescopeDTO(19,2.5,"white",2300);

        List<TelescopeDTO> list=new ArrayList<>();
        list.add(telescopeDTO);
        list.add(telescopeDTO1);
        list.add(telescopeDTO2);
        list.add(telescopeDTO3);
        list.add(telescopeDTO4);

        Comparator<TelescopeDTO> telescopeDTOComparatorLengthAcse=(o1,o2)->{
          return Double.compare(o1.getLength(),o2.getLength());
        };
        Collections.sort(list,telescopeDTOComparatorLengthAcse);
        for(TelescopeDTO dto:list){
            System.out.println(dto);
        }

        Comparator<TelescopeDTO> telescopeDTOComparatorLengthDesc=(o1,o2)->{
            return Double.compare(o2.getLength(),o1.getLength());
        };
        Collections.sort(list,telescopeDTOComparatorLengthDesc);
        for(TelescopeDTO dto:list){
            System.out.println(dto);
        }

        Comparator<TelescopeDTO> telescopeDTOComparatorWeightAcse=(o1,o2)->{
            return Double.compare(o1.getWeight(),o2.getWeight());
        };
        Collections.sort(list,telescopeDTOComparatorWeightAcse);
        for(TelescopeDTO dto:list){
            System.out.println(dto);
        }

        Comparator<TelescopeDTO> telescopeDTOComparatorColorAcse=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,telescopeDTOComparatorColorAcse);
        for(TelescopeDTO dto:list){
            System.out.println(dto);
        }

        Comparator<TelescopeDTO> telescopeDTOComparatorColorDesc=(o1,o2)->{
            return o2.getColor().compareTo(o1.getColor());
        };
        Collections.sort(list,telescopeDTOComparatorColorDesc);
        for(TelescopeDTO dto:list){
            System.out.println(dto);
        }

        Comparator<TelescopeDTO> telescopeDTOComparatorDistanceAcse=(o1,o2)->{
            return Double.compare(o1.getDistance(),o2.getDistance());
        };
        Collections.sort(list,telescopeDTOComparatorDistanceAcse);
        for(TelescopeDTO dto:list){
            System.out.println(dto);
        }


        Comparator<TelescopeDTO> telescopeDTOComparatorDistanceDesc=(o1,o2)->{
            return Double.compare(o2.getDistance(),o1.getDistance());
        };
        Collections.sort(list,telescopeDTOComparatorDistanceDesc);
        for(TelescopeDTO dto:list){
            System.out.println(dto);
        }

    }
}

package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.SensorDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorRunner {

    public static void main(String[] args) {

        SensorDTO sensorDTO=new SensorDTO("Ultrasonic","distance meansure",100,300);
        SensorDTO sensorDTO1=new SensorDTO("flame sensor","fire detector",500,20);
        SensorDTO sensorDTO2=new SensorDTO("humidity sensor","humidity",200,10);
        SensorDTO sensorDTO3=new SensorDTO("temperature sensor","temperature",250,15);
        SensorDTO sensorDTO4=new SensorDTO("moisture sensor","moisture",450,20);

        List<SensorDTO> list=new ArrayList<>();
        list.add(sensorDTO);
        list.add(sensorDTO1);
        list.add(sensorDTO2);
        list.add(sensorDTO3);
        list.add(sensorDTO4);

        for(SensorDTO ref:list){
            System.out.println(ref);
        }
        System.out.println("in ascending order");
        Comparator<SensorDTO> comparator=new SensorCostComparatorAsce();
        Collections.sort(list,comparator);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator1=new SensorCostComparatorDesc();
        Collections.sort(list,comparator1);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator2=new SensorDistanceComparatorAsce();
        Collections.sort(list,comparator2);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator3=new SensorDistanceComparatorDesc();
        Collections.sort(list,comparator3);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator4=new SensorNameComparatorAsce();
        Collections.sort(list,comparator4);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator5=new SensorNameComparatorDesc();
        Collections.sort(list,comparator5);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator6=new SensorTypeComparatorAsce();
        Collections.sort(list,comparator6);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<SensorDTO> comparator7=new SensorTypeComparatorDesc();
        Collections.sort(list,comparator7);
        for(SensorDTO dto:list){
            System.out.println(dto);
        }

    }
}

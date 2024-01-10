package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.ParkingDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingRunner {

    public static void main(String[] args) {

        ParkingDTO parkingDTO=new ParkingDTO("Bike parking","mall",40,20);
        ParkingDTO parkingDTO1=new ParkingDTO("Car parking","Shop",20,10);
        ParkingDTO parkingDTO2=new ParkingDTO("Bike parking","Bus stand",100,15);
        ParkingDTO parkingDTO3=new ParkingDTO("Car parking","Railway station",40,50);
        ParkingDTO parkingDTO4=new ParkingDTO("Bike parking","theatre",20,30);

        List<ParkingDTO> list=new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);
        list.add(parkingDTO4);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator=new ParkingPlaceNameComparatorAsce();
        Collections.sort(list,comparator);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator1=new ParkingPlaceNameComparatorDesc();
        Collections.sort(list,comparator1);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator2=new ParkingTypeComparatorAsce();
        Collections.sort(list,comparator2);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator3=new ParkingTypeComparatorDesc();
        Collections.sort(list,comparator3);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator4=new ParkingCostForParkingComparatorAsce();
        Collections.sort(list,comparator4);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator5=new ParkingCostForParkingComparatorDesc();
        Collections.sort(list,comparator5);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator6=new ParkingNoOfParkedVehiclesComparatorAsce();
        Collections.sort(list,comparator6);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }

        Comparator<ParkingDTO> comparator7=new ParkingCostForParkingComparatorDesc();
        Collections.sort(list,comparator7);

        for(ParkingDTO dto:list){
            System.out.println(dto);
        }
    }
}

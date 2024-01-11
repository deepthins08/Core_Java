package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.LiftDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiftRunner {
    public static void main(String[] args) {

        LiftDTO liftDTO=new LiftDTO(10,"flat",10,true);
        LiftDTO liftDTO1=new LiftDTO(15,"company",20,true);
        LiftDTO liftDTO2=new LiftDTO(12,"metro station",5,true);
        LiftDTO liftDTO3=new LiftDTO(20,"hospital",7,false);
        LiftDTO liftDTO4=new LiftDTO(7,"apartment",5,false);

        List<LiftDTO> list=new ArrayList<>();
        list.add(liftDTO);
        list.add(liftDTO1);
        list.add(liftDTO2);
        list.add(liftDTO3);
        list.add(liftDTO4);

        System.out.println("Ascending by capacity");
        Comparator<LiftDTO> liftDTOComparatorCapacityAsce=(o1,o2)->{

            return Integer.compare(o1.getCapacity(),o2.getCapacity());
        };
        Collections.sort(list,liftDTOComparatorCapacityAsce);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by capacity");
        Comparator<LiftDTO> liftDTOComparatorCapacityDesc=(o1,o2)->{

            return Integer.compare(o2.getCapacity(),o1.getCapacity());
        };
        Collections.sort(list,liftDTOComparatorCapacityDesc);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by Place");
        Comparator<LiftDTO> liftDTOComparatorPlaceAsce=(o1,o2)->{

            return o1.getPlace().compareTo(o2.getPlace());
        };
        Collections.sort(list,liftDTOComparatorPlaceAsce);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by Place");
        Comparator<LiftDTO> liftDTOComparatorPlaceDesc=(o1,o2)->{

            return o2.getPlace().compareTo(o1.getPlace());
        };
        Collections.sort(list,liftDTOComparatorPlaceDesc);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by nooffloors");
        Comparator<LiftDTO> liftDTOComparatorNoOfFloorsAsce=(o1,o2)->{

            return Integer.compare(o1.getNoOfFloors(),o2.getNoOfFloors());
        };
        Collections.sort(list,liftDTOComparatorNoOfFloorsAsce);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by nooffloors");
        Comparator<LiftDTO> liftDTOComparatorNoOfFloorsDesc=(o1,o2)->{

            return Integer.compare(o2.getNoOfFloors(),o1.getNoOfFloors());
        };
        Collections.sort(list,liftDTOComparatorNoOfFloorsDesc);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by double door");
        Comparator<LiftDTO> liftDTOComparatorDoubleDoorAsce=(o1,o2)->{

            return Boolean.compare(o1.isDoubleDoor(),o2.isDoubleDoor());
        };
        Collections.sort(list,liftDTOComparatorDoubleDoorAsce);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending by double door");
        Comparator<LiftDTO> liftDTOComparatorDoubleDoorDesc=(o1,o2)->{

            return Boolean.compare(o2.isDoubleDoor(),o1.isDoubleDoor());
        };
        Collections.sort(list,liftDTOComparatorDoubleDoorDesc);
        for(LiftDTO dto:list){
            System.out.println(dto);
        }
    }
}

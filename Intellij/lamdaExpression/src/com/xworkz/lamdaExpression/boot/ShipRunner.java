package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.ShipDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShipRunner {

    public static void main(String[] args) {

        ShipDTO shipDTO=new ShipDTO("Carpe Diem","white","goa","tanker");
        ShipDTO shipDTO1=new ShipDTO(" Beauty","blue","malpe","coaster");
        ShipDTO shipDTO2=new ShipDTO("The Ferocious Ranger","black","vizag","cargo");
        ShipDTO shipDTO3=new ShipDTO("The Pink Fleet","pink","mumbai","whalefactory");
        ShipDTO shipDTO4=new ShipDTO(" The Grey Scythe","gray","chennai","tanker");

        List<ShipDTO> list=new ArrayList<>();
        list.add(shipDTO);
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);

        System.out.println("Ascending by name");
        Comparator<ShipDTO> shipDTOComparatorNameAsce=(o1,o2)->{
          return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,shipDTOComparatorNameAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descendong by name");
        Comparator<ShipDTO> shipDTOComparatorNameDesc=(o1,o2)->{
            return o2.getName().compareTo(o1.getName());
        };
        Collections.sort(list,shipDTOComparatorNameDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by color");
        Comparator<ShipDTO> shipDTOComparatorColorAsce=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,shipDTOComparatorColorAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by color");
        Comparator<ShipDTO> shipDTOComparatorColorDesc=(o1,o2)->{
            return o2.getColor().compareTo(o1.getColor());
        };
        Collections.sort(list,shipDTOComparatorColorDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by location");
        Comparator<ShipDTO> shipDTOComparatorLocationAsce=(o1,o2)->{
            return o1.getLocation().compareTo(o2.getLocation());
        };
        Collections.sort(list,shipDTOComparatorLocationAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by location");
        Comparator<ShipDTO> shipDTOComparatorLocationDesc=(o1,o2)->{
            return o2.getLocation().compareTo(o1.getLocation());
        };
        Collections.sort(list,shipDTOComparatorLocationDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by type");
        Comparator<ShipDTO> shipDTOComparatorTypeAsce=(o1,o2)->{
            return o1.getType().compareTo(o2.getType());
        };
        Collections.sort(list,shipDTOComparatorTypeAsce);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by type");
        Comparator<ShipDTO> shipDTOComparatorTypeDesc=(o1,o2)->{
            return o1.getType().compareTo(o2.getType());
        };
        Collections.sort(list,shipDTOComparatorTypeDesc);
        for(ShipDTO dto:list){
            System.out.println(dto);
        }
    }
}

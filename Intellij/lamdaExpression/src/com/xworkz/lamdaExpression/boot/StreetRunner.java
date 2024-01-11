package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.StreetDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreetRunner {

    public static void main(String[] args) {

        StreetDTO streetDTO = new StreetDTO("1st main road btm","banglore","karnataka","india");
        StreetDTO streetDTO1 = new StreetDTO("7th cross vidyanagara","davangere","karnataka","india");
        StreetDTO streetDTO2 = new StreetDTO("4th main road","Vizag","Andhra","india");
        StreetDTO streetDTO3 = new StreetDTO("church street","banglore","karnataka","india");
        StreetDTO streetDTO4 = new StreetDTO("chikpete","banglore","karnataka","india");

        List<StreetDTO> list=new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);

        System.out.println("Ascending by name");
        Comparator<StreetDTO> streetDTOComparatorNameAsce=(o1,o2)->{
          return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,streetDTOComparatorNameAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by name");
        Comparator<StreetDTO> streetDTOComparatorNameDesc=(o1,o2)->{
            return o2.getName().compareTo(o1.getName());
        };
        Collections.sort(list,streetDTOComparatorNameDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by city");
        Comparator<StreetDTO> streetDTOComparatorCityAsce=(o1,o2)->{
            return o1.getCity().compareTo(o2.getCity());
        };
        Collections.sort(list,streetDTOComparatorCityAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by city");
        Comparator<StreetDTO> streetDTOComparatorCityDesc=(o1,o2)->{
            return o2.getCity().compareTo(o1.getCity());
        };
        Collections.sort(list,streetDTOComparatorCityDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by state");
        Comparator<StreetDTO> streetDTOComparatorStateAsce=(o1,o2)->{
            return o1.getState().compareTo(o2.getState());
        };
        Collections.sort(list,streetDTOComparatorStateAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by state");
        Comparator<StreetDTO> streetDTOComparatorStateDesc=(o1,o2)->{
            return o2.getState().compareTo(o1.getState());
        };
        Collections.sort(list,streetDTOComparatorStateDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by country");
        Comparator<StreetDTO> streetDTOComparatorCountryAsce=(o1,o2)->{
            return o1.getCountry().compareTo(o2.getCountry());
        };
        Collections.sort(list,streetDTOComparatorCountryAsce);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by country");
        Comparator<StreetDTO> streetDTOComparatorCountryDesc=(o1,o2)->{
            return o2.getCountry().compareTo(o1.getCountry());
        };
        Collections.sort(list,streetDTOComparatorCountryDesc);
        for(StreetDTO dto:list){
            System.out.println(dto);
        }


    }
}

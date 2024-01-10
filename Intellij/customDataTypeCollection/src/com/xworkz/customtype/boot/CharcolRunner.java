package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.CharcolDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcolRunner {
    public static void main(String[] args) {

        CharcolDTO charcolDTO=new CharcolDTO(1,"potting master","leadwort",228);
        CharcolDTO charcolDTO1=new CharcolDTO(1,"unigrow","plotting mixture",160);
        CharcolDTO charcolDTO2=new CharcolDTO(2,"orchidwala","manure",155);
        CharcolDTO charcolDTO3=new CharcolDTO(1,"koo","pltting mixture",171);
        CharcolDTO charcolDTO4=new CharcolDTO(1,"orchid","potting mixture",199);

        List<CharcolDTO> list=new ArrayList<>();
        list.add(charcolDTO);
        list.add(charcolDTO1);
        list.add(charcolDTO2);
        list.add(charcolDTO3);
        list.add(charcolDTO4);

        for(CharcolDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending order in brand");
        Comparator<CharcolDTO> comparator=new CharcolBrandComparatorAsce();
        Collections.sort(list,comparator);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in brand");
        Comparator<CharcolDTO> comparator1=new CharcolBrandComparatorDesc();
        Collections.sort(list,comparator1);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in quantity");
        Comparator<CharcolDTO> comparator2=new CharcolQuantityComparatorAsce();
        Collections.sort(list,comparator2);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in Quantity");
        Comparator<CharcolDTO> comparator3=new CharcolQuantityComparatorDesc();
        Collections.sort(list,comparator3);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending oreder in type");
        Comparator<CharcolDTO> comparator4=new CharcolTypeComparatorAsce();
        Collections.sort(list,comparator4);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in type");
        Comparator<CharcolDTO> comparator5=new CharcolTypeComparatorDesc();
        Collections.sort(list,comparator5);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order in cost");
        Comparator<CharcolDTO> comparator6=new CharcolCostComparatorAsce();
        Collections.sort(list,comparator6);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order in cost");
        Comparator<CharcolDTO> comparator7=new CharcolCostComparatorDesc();
        Collections.sort(list,comparator7);
        for(CharcolDTO dto:list){
            System.out.println(dto);
        }
    }
}

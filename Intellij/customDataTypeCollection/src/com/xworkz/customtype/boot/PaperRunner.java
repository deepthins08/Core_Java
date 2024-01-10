package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.PaperDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner {

    public static void main(String[] args) {

        PaperDTO paperDTO=new PaperDTO("A4",3,12,"white");
        PaperDTO paperDTO1=new PaperDTO("buff",2,10,"white");
        PaperDTO paperDTO2=new PaperDTO("drawing sheet",5,20,"pink");
        PaperDTO paperDTO3=new PaperDTO("thin paper",2,10,"white");
        PaperDTO paperDTO4=new PaperDTO("thick paper",3,10,"black");

        List<PaperDTO> list=new ArrayList<>();
        list.add(paperDTO);
        list.add(paperDTO1);
        list.add(paperDTO2);
        list.add(paperDTO3);
        list.add(paperDTO4);

        for(PaperDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order of cost");
        Comparator<PaperDTO> comparator=new PaperCostComparatorAsce();
        Collections.sort(list,comparator);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("descending order of cost");
        Comparator<PaperDTO> comparator1=new PaperCostComparatorDesc();
        Collections.sort(list,comparator1);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("ascending order of type");
        Comparator<PaperDTO> comparator2=new PaperTypeComapratorAsce();
        Collections.sort(list,comparator2);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order of type");
        Comparator<PaperDTO> comparator3=new PaperTypeComparatorDesc();
        Collections.sort(list,comparator3);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order of size");
        Comparator<PaperDTO> comparator4=new PaperSizeComparatorAsce();
        Collections.sort(list,comparator4);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Descending order of size");
        Comparator<PaperDTO> comparator5=new PaperSizeComparatorAsce();
        Collections.sort(list,comparator5);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order of Color");
        Comparator<PaperDTO> comparator6=new PaperColorComparatorAsce();
        Collections.sort(list,comparator6);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }

        System.out.println("Ascending order of Color");
        Comparator<PaperDTO> comparator7=new PaperColorComparatorDesc();
        Collections.sort(list,comparator7);
        for(PaperDTO dto:list){
            System.out.println(dto);
        }

    }
}

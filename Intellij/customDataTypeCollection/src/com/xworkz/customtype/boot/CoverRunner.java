package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.CoverDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoverRunner {

    public static void main(String[] args) {
        CoverDTO coverDTO=new CoverDTO("plastic",20,"blue",true);
        CoverDTO coverDTO1=new CoverDTO("paper",30,"gray",true);
        CoverDTO coverDTO2=new CoverDTO("synthetic",15,"black",false);
        CoverDTO coverDTO3=new CoverDTO("plastic",19,"white",false);
        CoverDTO coverDTO4=new CoverDTO("cloth",40,"pink",true);

        List<CoverDTO> list=new ArrayList<>();
        list.add(coverDTO);
        list.add(coverDTO1);
        list.add(coverDTO2);
        list.add(coverDTO3);
        list.add(coverDTO4);

        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator=new CoverColorComparatorAsce();
        Collections.sort(list,comparator);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator1=new CoverColorComparatorDesc();
        Collections.sort(list,comparator1);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator2=new CoverTypeComparatorAsce();
        Collections.sort(list,comparator2);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator3=new CoverTypeComparatorDesc();
        Collections.sort(list,comparator3);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator4=new CoverThicknessComparatorAsce();
        Collections.sort(list,comparator4);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator5=new CoverThicknessComparatorDesc();
        Collections.sort(list,comparator5);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator6=new CoverCostComparatorAsce();
        Collections.sort(list,comparator6);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }

        Comparator<CoverDTO> comparator7=new CoverCostComparatorDesc();
        Collections.sort(list,comparator7);
        for(CoverDTO dto:list){
            System.out.println(dto);
        }
    }
}

package com.xworkz.customtype.boot;

import com.xworkz.customtype.dto.BeltDTO;
import com.xworkz.customtype.sort.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltRunner {
    public static void main(String[] args) {
        BeltDTO beltDTO=new BeltDTO(9,"brown",1,36);
        BeltDTO beltDTO1=new BeltDTO(8,"black",1,38);
        BeltDTO beltDTO2=new BeltDTO(10,"gray",2,36);
        BeltDTO beltDTO3=new BeltDTO(9,"black",1,40);
        BeltDTO beltDTO4=new BeltDTO(7,"brown",3,38);

        List<BeltDTO> list=new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);
        list.add(beltDTO4);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator=new BeltColorComparatorAsce();
        Collections.sort(list,comparator);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator1=new BeltColorComparatorDesc();
        Collections.sort(list,comparator1);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator2=new BeltLengthComparatorAsce();
        Collections.sort(list,comparator2);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator3=new BeltLengthComparatorDesc();
        Collections.sort(list,comparator3);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator4=new BeltQuantityComparatorAsce();
        Collections.sort(list,comparator4);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator5=new BeltQuantityComparatorDesc();
        Collections.sort(list,comparator5);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator6=new BeltSizeComparatorAsce();
        Collections.sort(list,comparator6);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }

        Comparator<BeltDTO> comparator7=new BeltSizeComparatorDesc();
        Collections.sort(list,comparator7);

        for(BeltDTO dto:list){
            System.out.println(dto);
        }
    }
}

package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SkyWalkRunner {

    public static void main(String[] args) {

        SkyWalkDTO skyWalkDTO=new SkyWalkDTO("Glass bridge","Kerala",40,150);
        SkyWalkDTO skyWalkDTO1=new SkyWalkDTO("Vagamon glass bridge","vagamon",40,150);
        SkyWalkDTO skyWalkDTO2=new SkyWalkDTO("Sky bridge 721","Czech",95,560);
        SkyWalkDTO skyWalkDTO3=new SkyWalkDTO("East taihang glass walk","China",226,100);
        SkyWalkDTO skyWalkDTO4=new SkyWalkDTO("Zhangjiajie","Wulingyuan",430,300);

        List<SkyWalkDTO> list=new ArrayList<>();
        list.add(skyWalkDTO);
        list.add(skyWalkDTO1);
        list.add(skyWalkDTO2);
        list.add(skyWalkDTO3);
        list.add(skyWalkDTO4);
        System.out.println("Ascending by name");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorAsce=(name1,name2)->{
            return name1.getName().compareTo(name2.getName());
        };
        Collections.sort(list,skyWalkDTOComparatorAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by name");
        Comparator<SkyWalkDTO> skyWalkDTOComparatorDesc=(name1,name2)->{
          return name2.getName().compareTo(name1.getName());
        };
        Collections.sort(list,skyWalkDTOComparatorDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by place");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsPlaceAsce=(o1,o2)->{
          return o1.getPlace().compareTo(o2.getPlace());
        };
        Collections.sort(list,skyWalkDTOCollectionsPlaceAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by place");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsPlaceDesc=(o1,o2)->{
            return o2.getPlace().compareTo(o1.getPlace());
        };
        Collections.sort(list,skyWalkDTOCollectionsPlaceDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by length");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsLengthAsce=(o1,o2)->{
            return Double.compare(o1.getLength(),o2.getLength());
        };
        Collections.sort(list,skyWalkDTOCollectionsLengthAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by length");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsLengthDesc=(o1,o2)->{
            return Double.compare(o2.getLength(),o1.getLength());
        };
        Collections.sort(list,skyWalkDTOCollectionsLengthDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Ascending by Height");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsHeightAsce=(o1,o2)->{
            return Double.compare(o1.getHieght(),o2.getHieght());
        };
        Collections.sort(list,skyWalkDTOCollectionsHeightAsce);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }
        System.out.println("Descending by Height");
        Comparator<SkyWalkDTO> skyWalkDTOCollectionsHeightDesc=(o1,o2)->{
            return Double.compare(o2.getHieght(),o1.getHieght());
        };
        Collections.sort(list,skyWalkDTOCollectionsHeightDesc);
        for(SkyWalkDTO dto:list){
            System.out.println(dto);
        }



    }
}

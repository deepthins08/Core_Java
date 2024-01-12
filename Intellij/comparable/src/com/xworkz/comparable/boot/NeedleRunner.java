package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.NeedleDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeedleRunner {
    public static void main(String[] args) {

        NeedleDTO needleDTO=new NeedleDTO("Ballpoint",'s',10D);
        NeedleDTO needleDTO1=new NeedleDTO("Quilting",'L',20D);
        NeedleDTO needleDTO2=new NeedleDTO("Sharp",'s',5D);
        NeedleDTO needleDTO3=new NeedleDTO("Leather",'M',10D);
        NeedleDTO needleDTO4=new NeedleDTO("Strech",'L',15D);

        List<NeedleDTO> list=new ArrayList<>();
        list.add(needleDTO);
        list.add(needleDTO1);
        list.add(needleDTO2);
        list.add(needleDTO3);
        list.add(needleDTO4);

        Collections.sort(list);
        for (NeedleDTO dto:list){
            System.out.println(dto);
        }

    }
}

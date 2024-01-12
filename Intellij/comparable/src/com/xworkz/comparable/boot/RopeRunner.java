package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.RopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RopeRunner {
    public static void main(String[] args) {

        RopeDTO ropeDTO=new RopeDTO("fibre",90D,20D);
        RopeDTO ropeDTO1=new RopeDTO("plastic",120D,25D);
        RopeDTO ropeDTO2=new RopeDTO("cotton",130D,30D);
        RopeDTO ropeDTO3=new RopeDTO("plastic",50D,15D);
        RopeDTO ropeDTO4=new RopeDTO("cotton",100D,16D);

        List<RopeDTO> list=new ArrayList<>();
        list.add(ropeDTO);
        list.add(ropeDTO1);
        list.add(ropeDTO2);
        list.add(ropeDTO3);
        list.add(ropeDTO4);

        Collections.sort(list);
        for(RopeDTO dto:list){
            System.out.println(dto);
        }
    }
}

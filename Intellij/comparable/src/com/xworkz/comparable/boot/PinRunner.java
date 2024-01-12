package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.PinDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PinRunner {
    public static void main(String[] args) {

        PinDTO pinDTO=new PinDTO("Cotter","silver",5);
        PinDTO pinDTO1=new PinDTO("Hair","black",2);
        PinDTO pinDTO2=new PinDTO("Linch","gold",1);
        PinDTO pinDTO3=new PinDTO("Hitch","red",8);
        PinDTO pinDTO4=new PinDTO("Spring","silver",3);

        List<PinDTO> list=new ArrayList<>();
        list.add(pinDTO);
        list.add(pinDTO1);
        list.add(pinDTO2);
        list.add(pinDTO3);
        list.add(pinDTO4);

        Collections.sort(list);
        for(PinDTO dto:list){
            System.out.println(dto);
        }




    }
}

package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.FireCrackerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FireCrackerRunner {
    public static void main(String[] args) {

        FireCrackerDTO fireCrackerDTO=new FireCrackerDTO("sparklers",200D,"red");
        FireCrackerDTO fireCrackerDTO1=new FireCrackerDTO("flower pots",100D,"white");
        FireCrackerDTO fireCrackerDTO2=new FireCrackerDTO("Rockets",140D,"violet");
        FireCrackerDTO fireCrackerDTO3=new FireCrackerDTO("Chakkars",70D,"white");
        FireCrackerDTO fireCrackerDTO4=new FireCrackerDTO("Bomb",130D,"pink");

        List<FireCrackerDTO> list=new ArrayList<>();
        list.add(fireCrackerDTO);
        list.add(fireCrackerDTO1);
        list.add(fireCrackerDTO2);
        list.add(fireCrackerDTO3);
        list.add(fireCrackerDTO4);

        Collections.sort(list);
        for (FireCrackerDTO dto:list){
            System.out.println(dto);
        }


    }
}

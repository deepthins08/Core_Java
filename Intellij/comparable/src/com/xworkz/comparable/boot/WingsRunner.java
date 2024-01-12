package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.WingsDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingsRunner {

    public static void main(String[] args) {

        WingsDTO wingsDTO=new WingsDTO("white","crane wings",true);
        WingsDTO wingsDTO1=new WingsDTO("green","parrot wings",true);
        WingsDTO wingsDTO2=new WingsDTO("blue","king fisher",true);
        WingsDTO wingsDTO3=new WingsDTO("red","cock",true);
        WingsDTO wingsDTO4=new WingsDTO("brown","owl",true);

        List<WingsDTO> list=new ArrayList<>();
        list.add(wingsDTO);
        list.add(wingsDTO1);
        list.add(wingsDTO2);
        list.add(wingsDTO3);
        list.add(wingsDTO4);

        Collections.sort(list);
        for(WingsDTO dto:list){
            System.out.println(dto);
        }
    }
}

package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.ToyDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyRunner {

    public static void main(String[] args) {

        ToyDTO toyDTO=new ToyDTO("car","fibre",300D);
        ToyDTO toyDTO1=new ToyDTO("barbie","plastic",600D);
        ToyDTO toyDTO2=new ToyDTO("JCB","fibre",500D);
        ToyDTO toyDTO3=new ToyDTO("helicopter","plastic",1500D);
        ToyDTO toyDTO4=new ToyDTO("Hulk","rubber",2000D);

        List<ToyDTO> list=new ArrayList<>();
        list.add(toyDTO);
        list.add(toyDTO1);
        list.add(toyDTO2);
        list.add(toyDTO3);
        list.add(toyDTO4);

        Collections.sort(list);
        for(ToyDTO dto:list){
            System.out.println(dto);
        }
    }
}

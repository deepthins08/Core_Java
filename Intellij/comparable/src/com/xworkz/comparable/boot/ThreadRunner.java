package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.ThreadDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadRunner {
    public static void main(String[] args) {

        ThreadDTO threadDTO=new ThreadDTO("black",1,"synthetic");
        ThreadDTO threadDTO1=new ThreadDTO("white",2,"fibre");
        ThreadDTO threadDTO2=new ThreadDTO("yellow",9,"plastic");
        ThreadDTO threadDTO3=new ThreadDTO("orange",6,"cotton");
        ThreadDTO threadDTO4=new ThreadDTO("purple",3,"nylon");

        List<ThreadDTO> list=new ArrayList<>();
        list.add(threadDTO);
        list.add(threadDTO1);
        list.add(threadDTO2);
        list.add(threadDTO3);
        list.add(threadDTO4);

        Collections.sort(list);
        for(ThreadDTO dto:list){
            System.out.println(dto);
        }
    }
}

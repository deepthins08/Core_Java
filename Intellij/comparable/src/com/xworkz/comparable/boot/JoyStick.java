package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.JoyStickDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoyStick {

    public static void main(String[] args) {

        JoyStickDTO joyStickDTO=new JoyStickDTO("black",1999D,true);
        JoyStickDTO joyStickDTO1=new JoyStickDTO("red",1500D,true);
        JoyStickDTO joyStickDTO2=new JoyStickDTO("white",600D,false);
        JoyStickDTO joyStickDTO3=new JoyStickDTO("gray",800D,false);
        JoyStickDTO joyStickDTO4=new JoyStickDTO("green",2000D,true);

        List<JoyStickDTO> list=new ArrayList<>();
        list.add(joyStickDTO);
        list.add(joyStickDTO1);
        list.add(joyStickDTO2);
        list.add(joyStickDTO3);
        list.add(joyStickDTO4);

        Collections.sort(list);
        for(JoyStickDTO dto:list){
            System.out.println(dto);
        }

    }
}

package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.PlayGroundDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundRunner{

    public static void main(String[] args) {

        PlayGroundDTO playGroundDTO=new PlayGroundDTO("BTM","Kempegowda",2,"Basket Ball");
        PlayGroundDTO playGroundDTO1=new PlayGroundDTO("Davangere","Bapuji stadium",1.2,"ALl Games");
        PlayGroundDTO playGroundDTO2=new PlayGroundDTO("Davangere","High School field",3,"Outdoor games");
        PlayGroundDTO playGroundDTO3=new PlayGroundDTO("BTM","Nandanavana",1.6,"kids plays");
        PlayGroundDTO playGroundDTO4=new PlayGroundDTO("Tippasandra","BBMP",2.5,"Cricket");

        List<PlayGroundDTO> list=new ArrayList<>();
        list.add(playGroundDTO);
        list.add(playGroundDTO1);
        list.add(playGroundDTO2);
        list.add(playGroundDTO3);
        list.add(playGroundDTO4);

        Collections.sort(list);
        list.forEach(l-> System.out.println(l));
        System.out.println("---------------------------------------------");
        System.out.println("ascending by place");
        Collections.sort(list,(p1,p2)->p1.getPlace().compareTo(p2.getPlace()));
        list.forEach(l-> System.out.println(l));
        System.out.println("descending by place");
        Collections.sort(list,(p1,p2)->p2.getPlace().compareTo(p1.getPlace()));
        list.forEach(l-> System.out.println(l));
        System.out.println("ascending by name");
        Collections.sort(list,(p1,p2)->p1.getName().compareTo(p2.getName()));
        list.forEach(l-> System.out.println(l));
        System.out.println("descending by name");
        Collections.sort(list,(p1,p2)->p2.getPlace().compareTo(p2.getPlace()));
        list.forEach(l-> System.out.println(l));
        System.out.println("ascending by type");
        Collections.sort(list,(p1,p2)->p1.getType().compareTo(p2.getType()));
        list.forEach(l-> System.out.println(l));
        System.out.println("descending by type");
        Collections.sort(list,(p1,p2)->p2.getType().compareTo(p1.getType()));
        list.forEach(l-> System.out.println(l));



    }
}

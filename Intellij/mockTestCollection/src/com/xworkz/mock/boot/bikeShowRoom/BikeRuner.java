package com.xworkz.mock.boot.bikeShowRoom;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BikeRuner {
    public static void main(String[] args) {

        BikeShowRoomDTO bikeShowRoomDTO=new BikeShowRoomDTO("Honda","Banglore",562832);
        BikeShowRoomDTO bikeShowRoomDTO1=new BikeShowRoomDTO("Hero","Davangere",583782);
        BikeShowRoomDTO bikeShowRoomDTO2=new BikeShowRoomDTO("Ruthvi","Bellary",582388);
        BikeShowRoomDTO bikeShowRoomDTO3=new BikeShowRoomDTO("Lakshmi","Banglore",583288);
        BikeShowRoomDTO bikeShowRoomDTO4=new BikeShowRoomDTO("Capital","Chitradurga",587378);
        BikeShowRoomDTO bikeShowRoomDTO5=new BikeShowRoomDTO("Racer","Manglore",582373);
        BikeShowRoomDTO bikeShowRoomDTO6=new BikeShowRoomDTO("Duke","Mumbai",582383);
        BikeShowRoomDTO bikeShowRoomDTO7=new BikeShowRoomDTO("RoyalEnfield","Pune",538233);
        BikeShowRoomDTO bikeShowRoomDTO8=new BikeShowRoomDTO("Splender","Gadag",583283);
        BikeShowRoomDTO bikeShowRoomDTO9=new BikeShowRoomDTO("Suzuki","Koppala",583282);
        BikeShowRoomDTO bikeShowRoomDTO10=new BikeShowRoomDTO("Rx","Mysore",538923);
        BikeShowRoomDTO bikeShowRoomDTO11=new BikeShowRoomDTO("Maruthi","Kodagu",583823);

        BikeDTO bikeDTO=new BikeDTO("India");
        BikeDTO bikeDTO1=new BikeDTO("India");
        BikeDTO bikeDTO2=new BikeDTO("India");
        BikeDTO bikeDTO3=new BikeDTO("India");
        BikeDTO bikeDTO4=new BikeDTO("India");
        BikeDTO bikeDTO5=new BikeDTO("India");
        BikeDTO bikeDTO6=new BikeDTO("India");
        BikeDTO bikeDTO7=new BikeDTO("India");
        BikeDTO bikeDTO8=new BikeDTO("India");
        BikeDTO bikeDTO9=new BikeDTO("India");
        BikeDTO bikeDTO10=new BikeDTO("India");
        BikeDTO bikeDTO11=new BikeDTO("India");

        Map<BikeShowRoomDTO,BikeDTO> map=new HashMap<>();
        map.put(bikeShowRoomDTO,bikeDTO);
        map.put(bikeShowRoomDTO1,bikeDTO1);
        map.put(bikeShowRoomDTO2,bikeDTO2);
        map.put(bikeShowRoomDTO3,bikeDTO3);
        map.put(bikeShowRoomDTO4,bikeDTO4);
        map.put(bikeShowRoomDTO5,bikeDTO5);
        map.put(bikeShowRoomDTO6,bikeDTO6);
        map.put(bikeShowRoomDTO7,bikeDTO7);
        map.put(bikeShowRoomDTO8,bikeDTO8);
        map.put(bikeShowRoomDTO9,bikeDTO9);
        map.put(bikeShowRoomDTO10,bikeDTO10);
        map.put(bikeShowRoomDTO11,bikeDTO11);





        map.entrySet().removeIf((entry) -> entry.getKey().getCity().equals("Banglore"));
        Set<Map.Entry<BikeShowRoomDTO,BikeDTO>>  result=map.entrySet();
        result.forEach(System.out::println);
    }
}

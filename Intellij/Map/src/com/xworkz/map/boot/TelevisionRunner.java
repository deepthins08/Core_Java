package com.xworkz.map.boot;

import com.xworkz.map.dto.CableProviderDTO;
import com.xworkz.map.dto.TelevisionDTO;

import java.util.HashMap;
import java.util.Map;

public class TelevisionRunner {
    public static void main(String[] args) {

        TelevisionDTO televisionDTO=new TelevisionDTO("sony",25000,2636);
        TelevisionDTO televisionDTO1=new TelevisionDTO("LG",20000,377);
        TelevisionDTO televisionDTO2=new TelevisionDTO("Toshiba",30000,7323);
        TelevisionDTO televisionDTO3=new TelevisionDTO("samsung",40000,7373);
        TelevisionDTO televisionDTO4=new TelevisionDTO("panasonic",35000,9273);
        TelevisionDTO televisionDTO5=new TelevisionDTO("TCL",28000,2344);
        TelevisionDTO televisionDTO6=new TelevisionDTO("Haier",32000,2626);
        TelevisionDTO televisionDTO7=new TelevisionDTO("Toshiba",29000,62637);
        TelevisionDTO televisionDTO8=new TelevisionDTO("oneplus",45000,76327);
        TelevisionDTO televisionDTO9=new TelevisionDTO("xiaomi",37000,3344);

        CableProviderDTO cableProviderDTO=new CableProviderDTO("bharathi Airtel","Banglore",1599);
        CableProviderDTO cableProviderDTO1=new CableProviderDTO("Den network","Mumbai",1499);
        CableProviderDTO cableProviderDTO2=new CableProviderDTO("sundirect","Hyderabad",1455);
        CableProviderDTO cableProviderDTO3=new CableProviderDTO("Hathway","Gurgaun",1299);
        CableProviderDTO cableProviderDTO4=new CableProviderDTO("tata play","pune",1199);
        CableProviderDTO cableProviderDTO5=new CableProviderDTO("GTPL","chennai",999);
        CableProviderDTO cableProviderDTO6=new CableProviderDTO("Vimeo Technologies","kochi",1233);
        CableProviderDTO cableProviderDTO7=new CableProviderDTO("Asianet Satellite Communications","delhi",1699);
        CableProviderDTO cableProviderDTO8=new CableProviderDTO("Reliance Jio","mumbai",1122);
        CableProviderDTO cableProviderDTO9=new CableProviderDTO("Dish TV","india",999);

        Map<TelevisionDTO,CableProviderDTO> map=new HashMap<>();
        map.put(televisionDTO,cableProviderDTO);
        map.put(televisionDTO1,cableProviderDTO1);
        map.put(televisionDTO2,cableProviderDTO2);
        map.put(televisionDTO3,cableProviderDTO3);
        map.put(televisionDTO4,cableProviderDTO4);
        map.put(televisionDTO5,cableProviderDTO5);
        map.put(televisionDTO6,cableProviderDTO6);
        map.put(televisionDTO7,cableProviderDTO7);
        map.put(televisionDTO8,cableProviderDTO8);
        map.put(televisionDTO9,cableProviderDTO9);

        map.forEach((l,k)-> System.out.println(l+" and "+k));

    }
}

package com.xworkz.map.boot;

import com.xworkz.map.dto.CityDTO;
import com.xworkz.map.dto.CountryDTO;

import java.util.HashMap;
import java.util.Map;

public class CountryRunner {

    public static void main(String[] args) {

        CountryDTO countryDTO=new CountryDTO("india","Asia","hinduism");
        CountryDTO countryDTO1=new CountryDTO("United States","North America","Christianity");
        CountryDTO countryDTO2=new CountryDTO("Brazil ","South America","Catholicism");
        CountryDTO countryDTO3=new CountryDTO("China ","Asia "," Irreligious, Buddhism, Taoism");
        CountryDTO countryDTO4=new CountryDTO("Russia ","Europe","Christianity ");
        CountryDTO countryDTO5=new CountryDTO("Nigeria ","Africa ","Christianity, Islam");
        CountryDTO countryDTO6=new CountryDTO("China ","Asia","Islam");
        CountryDTO countryDTO7=new CountryDTO("Mexico ","North America","Christianity ");
        CountryDTO countryDTO8=new CountryDTO("France ","Europe ","Christianity ");
        CountryDTO countryDTO9=new CountryDTO("Egypt ","Africa ","Islam ");

        CityDTO cityDTO=new CityDTO("New Delhi",21800000,true);
        CityDTO cityDTO1=new CityDTO("Washington",700000,true);
        CityDTO cityDTO2=new CityDTO("Brasília",3100000,true);
        CityDTO cityDTO3=new CityDTO("Beijing",21500000,true);
        CityDTO cityDTO4=new CityDTO("Moscow",12500000,true);
        CityDTO cityDTO5=new CityDTO("Abuja",3900000,true);
        CityDTO cityDTO6=new CityDTO("Jakarta",10600000,true);
        CityDTO cityDTO7=new CityDTO("Mexico City",9200000,true);
        CityDTO cityDTO8=new CityDTO("Paris",2100000,true);
        CityDTO cityDTO9=new CityDTO("Cairo",9500000,true);

        Map<CountryDTO,CityDTO> map=new HashMap<>();
        map.put(countryDTO,cityDTO);
        map.put(countryDTO1,cityDTO1);
        map.put(countryDTO2,cityDTO2);
        map.put(countryDTO3,cityDTO3);
        map.put(countryDTO4,cityDTO4);
        map.put(countryDTO5,cityDTO5);
        map.put(countryDTO6,cityDTO6);
        map.put(countryDTO7,cityDTO7);
        map.put(countryDTO8,cityDTO8);
        map.put(countryDTO9,cityDTO9);

        map.forEach((k,l)-> System.out.println(k+" "+l));
    }
}

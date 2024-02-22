package com.xworkz.map.boot;

import com.xworkz.map.dto.AirlinesDTO;
import com.xworkz.map.dto.AirportDTO;

import java.util.HashMap;
import java.util.Map;

public class AirportRunner {

    public static void main(String[] args) {

        AirlinesDTO airlinesDTO=new AirlinesDTO("Boeing 747","Tokyo"," Los Angeles ");
        AirlinesDTO airlinesDTO1=new AirlinesDTO("Airbus A380","Paris","Germany");
        AirlinesDTO airlinesDTO2=new AirlinesDTO("Boeing 777","Atlanta ","USA");
        AirlinesDTO airlinesDTO3=new AirlinesDTO("Airbus A320","Brazil ","Argentina");
        AirlinesDTO airlinesDTO4=new AirlinesDTO("Boeing 737","London","Dubai ");
        AirlinesDTO airlinesDTO5=new AirlinesDTO("Embraer E190","Dubai ","Sydney ");
        AirlinesDTO airlinesDTO6=new AirlinesDTO("Airbus A330","New York","London ");
        AirlinesDTO airlinesDTO7=new AirlinesDTO("Boeing 787 Dreamliner","Beijing ","Sydney ");
        AirlinesDTO airlinesDTO8=new AirlinesDTO("Bombardier CRJ700","Chicago ","Canada");
        AirlinesDTO airlinesDTO9=new AirlinesDTO("Airbus A350","Singapore ","London ");

        AirportDTO airportDTO=new AirportDTO("Heathrow Airport","London"," United Kingdom");
        AirportDTO airportDTO1=new AirportDTO("Los Angeles International Airport","Los Angeles","United States");
        AirportDTO airportDTO2=new AirportDTO("Dubai International Airport","Dubai","United Arab Emirates");
        AirportDTO airportDTO3=new AirportDTO("Sydney Airport","Sydney","Australia");
        AirportDTO airportDTO4=new AirportDTO("Charles de Gaulle Airport","Paris","France");
        AirportDTO airportDTO5=new AirportDTO("Tokyo Narita International Airport ","Tokyo","Japan");
        AirportDTO airportDTO6=new AirportDTO("Atlanta Hartsfield-Jackson International Airport ","Georgia","United States");
        AirportDTO airportDTO7=new AirportDTO("Sao Paulo Guarulhos International Airport","Sao Paulo","Brazil");
        AirportDTO airportDTO8=new AirportDTO("Beijing Capital International Airport","Beijing","China");
        AirportDTO airportDTO9=new AirportDTO("Sydney Airport","Singapore","Singapore");

        Map<AirlinesDTO,AirportDTO> map=new HashMap<>();
        map.put(airlinesDTO,airportDTO);
        map.put(airlinesDTO1,airportDTO1);
        map.put(airlinesDTO2,airportDTO2);
        map.put(airlinesDTO3,airportDTO3);
        map.put(airlinesDTO4,airportDTO4);
        map.put(airlinesDTO5,airportDTO5);
        map.put(airlinesDTO6,airportDTO6);
        map.put(airlinesDTO7,airportDTO7);
        map.put(airlinesDTO8,airportDTO8);
        map.put(airlinesDTO9,airportDTO9);


        map.forEach((k,l)-> System.out.println(k+" "+l));
    }
}

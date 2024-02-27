package com.xworkz.map.boot;

import com.xworkz.map.dto.MovieDTO;
import com.xworkz.map.dto.TheatreDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComplexTypeMapMethodsExample {

    public static void main(String[] args) {

        MovieDTO movieDTO=new MovieDTO("The Godfather"," Francis Ford Coppola",7);
        MovieDTO movieDTO1=new MovieDTO("Inception ","Christopher Nolan",200);
        MovieDTO movieDTO2=new MovieDTO("Schindler's List","Steven Spielberg",22);
        MovieDTO movieDTO3=new MovieDTO("Pulp Fiction","Quentin Tarantino",9);

        TheatreDTO theatreDTO=new TheatreDTO("El Capitan Theatre","Los Angeles","The Lion King");
        TheatreDTO theatreDTO1=new TheatreDTO("The Electric Cinema","London","Notting Hill");
        TheatreDTO theatreDTO2=new TheatreDTO("Palais des Festivals et des Congrès","France","Various films screened during the Cannes Film Festival");
        TheatreDTO theatreDTO3=new TheatreDTO("Roxy Cinema"," New Zealand","The Lord of the Rings: The Fellowship of the Ring");


        Map<MovieDTO, TheatreDTO> theatreMovie=new HashMap<>();
        theatreMovie.put(movieDTO,theatreDTO);
        theatreMovie.put(movieDTO1,theatreDTO1);
        theatreMovie.put(movieDTO2,theatreDTO2);
        theatreMovie.put(movieDTO3,theatreDTO3);

        theatreMovie.values().forEach(System.out::println);
        theatreMovie.keySet().forEach(System.out::println);
        boolean contain= theatreMovie.containsKey(movieDTO2);
        System.out.println("Key is present "+contain);

        boolean containV=theatreMovie.containsValue(theatreDTO2);
        System.out.println("Values is present "+containV);

        Set<Map.Entry<MovieDTO,TheatreDTO>> set= theatreMovie.entrySet();
        set.forEach(System.out::println);

       TheatreDTO get= theatreMovie.get(movieDTO);
        System.out.println(get);


        int size= theatreMovie.size();
        System.out.println(size);

        boolean empty= theatreMovie.isEmpty();
        System.out.println("is empty "+empty);

        theatreMovie.remove(movieDTO3);
        theatreMovie.forEach((k,l)-> System.out.println(k+": "+l));

        System.out.println("Map from another map");
        Map<MovieDTO,TheatreDTO> map1=new HashMap<>();
        map1.putAll(theatreMovie);
        map1.forEach((k,l)-> System.out.println(k+": "+l));
        System.out.println("after clear map1");
        map1.clear();
        map1.forEach((k,l)-> System.out.println(k+": "+l));

    }
}

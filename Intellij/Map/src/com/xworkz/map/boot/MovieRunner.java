package com.xworkz.map.boot;

import com.xworkz.map.dto.MovieDTO;
import com.xworkz.map.dto.TheatreDTO;

import java.util.HashMap;
import java.util.Map;

public class MovieRunner {

    public static void main(String[] args) {
        MovieDTO movieDTO1=new MovieDTO("The Godfather"," Francis Ford Coppola",7);
        MovieDTO movieDTO2=new MovieDTO("Inception ","Christopher Nolan",200);
        MovieDTO movieDTO3=new MovieDTO("Schindler's List","Steven Spielberg",22);
        MovieDTO movieDTO4=new MovieDTO("Pulp Fiction","Quentin Tarantino",9);
        MovieDTO movieDTO5=new MovieDTO("The Shawshank Redemption","Frank Darabont",25);
        MovieDTO movieDTO6=new MovieDTO("The Dark Knight ","Christopher Nolan",185);
        MovieDTO movieDTO7=new MovieDTO("Forrest Gump","Robert Zemeckis",55);
        MovieDTO movieDTO8=new MovieDTO("Fight Club"," David Fincher",70);
        MovieDTO movieDTO9=new MovieDTO("The Matrix"," Wachowskis",80);
        MovieDTO movieDTO10=new MovieDTO("Goodfellas","Martin Scorsese",25);

        TheatreDTO theatreDTO=new TheatreDTO("El Capitan Theatre","Los Angeles","The Lion King");
        TheatreDTO theatreDTO1=new TheatreDTO("The Electric Cinema","London","Notting Hill");
        TheatreDTO theatreDTO2=new TheatreDTO("Palais des Festivals et des Congrès","France","Various films screened during the Cannes Film Festival");
        TheatreDTO theatreDTO3=new TheatreDTO("Roxy Cinema"," New Zealand","The Lord of the Rings: The Fellowship of the Ring");
        TheatreDTO theatreDTO4=new TheatreDTO("Sala Grande"," Italy ","Various films screened during the Venice Film Festival");
        TheatreDTO theatreDTO5=new TheatreDTO("Cinema City"," Serbia","Life Is a Miracle");
        TheatreDTO theatreDTO6=new TheatreDTO("Teatro alla Scala"," Italy ","Callas Forever");
        TheatreDTO theatreDTO7=new TheatreDTO("BFI Southbank","London","A Clockwork Orange");
        TheatreDTO theatreDTO8=new TheatreDTO("Edinburgh International Conference Centre (EICC)","Scotland ","Various films screened during the Edinburgh International Film Festival");
        TheatreDTO theatreDTO9=new TheatreDTO("Cinerama Dome","Los Angeles","2001: A Space Odyssey");

        Map<MovieDTO,TheatreDTO> map=new HashMap<>();
        map.put(movieDTO1,theatreDTO);
        map.put(movieDTO2,theatreDTO1);
        map.put(movieDTO3,theatreDTO2);
        map.put(movieDTO4,theatreDTO3);
        map.put(movieDTO5,theatreDTO4);
        map.put(movieDTO6,theatreDTO5);
        map.put(movieDTO7,theatreDTO6);
        map.put(movieDTO8,theatreDTO7);
        map.put(movieDTO9,theatreDTO8);
        map.put(movieDTO10,theatreDTO9);

        map.forEach((k,l)-> System.out.println(k+""+l));

    }
}

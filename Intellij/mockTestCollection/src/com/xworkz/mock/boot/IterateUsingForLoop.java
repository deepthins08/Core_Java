package com.xworkz.mock.boot;

import java.util.ArrayList;
import java.util.List;

public class IterateUsingForLoop {

    public static void main(String[] args) {

        List<String> movies=new ArrayList<>();
        movies.add("Inception");
        movies.add("Final Destination");
        movies.add("Chronicles of Narnia");
        movies.add("Madagascar");
        movies.add("Avengers");

        movies.forEach(System.out::println);

    }
}

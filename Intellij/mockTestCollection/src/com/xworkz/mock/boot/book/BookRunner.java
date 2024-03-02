package com.xworkz.mock.boot.book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookRunner {

    public static void main(String[] args) {

        BookDTO bookDTO=new BookDTO(LocalDate.of(2021,02,25),"John Fedric",9.7,600D);
        BookDTO bookDTO1=new BookDTO(LocalDate.of(2013,04,21),"Melena",8.4,885D);
        BookDTO bookDTO2=new BookDTO(LocalDate.of(2018,07,18),"Gomez",7.8,1300D);
        BookDTO bookDTO3=new BookDTO(LocalDate.of(2016,12,12),"Kelvin",9.2,1200D);
        BookDTO bookDTO4=new BookDTO(LocalDate.of(2023,06,30),"Lyra",6.9,500D);
        BookDTO bookDTO5=new BookDTO(LocalDate.of(2020,02,02),"Duke",4.4,455D);
        BookDTO bookDTO6=new BookDTO(LocalDate.of(2011,8,26),"Stephen",6.9,200D);
        BookDTO bookDTO7=new BookDTO(LocalDate.of(2012,11,12),"Damon",9.3,999D);
        BookDTO bookDTO8=new BookDTO(LocalDate.of(2009,10,29),"Tylor",2.8,1299D);
        BookDTO bookDTO9=new BookDTO(LocalDate.of(2001,06,8),"Elvom",9.9,2999D);
        BookDTO bookDTO10=new BookDTO(LocalDate.of(2018,03,30),"Peter",7.3,1499D);
        BookDTO bookDTO11=new BookDTO(LocalDate.of(2013,04,21),"Thomos",6.7,954D);
        BookDTO bookDTO12=new BookDTO(LocalDate.of(2022,01,01),"Eric",8.2,475D);

        List<BookDTO> list=new ArrayList<>();
        list.add(bookDTO);
        list.add(bookDTO1);
        list.add(bookDTO2);
        list.add(bookDTO3);
        list.add(bookDTO4);
        list.add(bookDTO5);
        list.add(bookDTO6);
        list.add(bookDTO7);
        list.add(bookDTO8);
        list.add(bookDTO9);
        list.add(bookDTO10);
        list.add(bookDTO11);
        list.add(bookDTO12);

        list.stream().sorted((o1,o2)->o1.getPublicationYear().compareTo(o2.getPublicationYear())).forEach(System.out::println);

        System.out.println("-------------------------------------------");
       Optional<BookDTO> book= list.stream().max(Comparator.comparing(BookDTO::getRating));
        System.out.println(book);
        System.out.println("----------------------------------------------");
       Double result= list.stream().mapToDouble(BookDTO::getPrice).sum();
        System.out.println(result);



    }
}

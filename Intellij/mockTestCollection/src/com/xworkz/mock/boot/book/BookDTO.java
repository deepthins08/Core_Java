package com.xworkz.mock.boot.book;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class BookDTO implements Serializable {

    private LocalDate publicationYear;
    private String author;
    private Double rating;
    private double price;

}

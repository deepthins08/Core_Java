package com.xworkz.stream.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class MedicineDTO implements Serializable {

    private  String name;
    private String id;
    private String company;
    private LocalDate expiryDate;
    private LocalDate manfDate;
    private double cost;
    private String[] ingredients;


}

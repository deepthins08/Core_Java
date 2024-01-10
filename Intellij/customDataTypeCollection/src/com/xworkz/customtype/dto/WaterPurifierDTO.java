package com.xworkz.customtype.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class WaterPurifierDTO implements Serializable {

    private String name;
    private String color;
    private double cost;
    private int capacity;
}

package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@Setter@Getter@NoArgsConstructor@AllArgsConstructor@ToString
public class GeyserDTO implements Serializable {

    private String brand;
    private String color;
    private double cost;
    private  int capacity;
}

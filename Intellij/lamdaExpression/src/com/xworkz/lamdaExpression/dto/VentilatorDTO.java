package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@Setter@Getter@ToString@AllArgsConstructor@NoArgsConstructor
public class VentilatorDTO implements Serializable {
    private String brand;
    private String color;
    private double cost;
    private int wattage;
}

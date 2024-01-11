package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@NoArgsConstructor@AllArgsConstructor@Setter@ToString@Getter
public class RadioDTO implements Serializable {

    private String brand;
    private String color;
    private double cost;
    private int quantity;
}

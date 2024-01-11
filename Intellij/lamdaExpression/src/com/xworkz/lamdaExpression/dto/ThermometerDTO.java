package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@ToString@Getter@NoArgsConstructor@AllArgsConstructor@Setter
public class ThermometerDTO implements Serializable {


    private double cost;
    private String color;
    private String type;
    private int maxtemp;
}

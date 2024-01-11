package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor@Setter@NoArgsConstructor@Getter@ToString

public class TelescopeDTO implements Serializable {

    private double length;
    private double weight;
    private String color;
    private double distance;
}

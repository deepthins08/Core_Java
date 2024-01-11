package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class SkyWalkDTO implements Serializable {
    private String name;
    private String place;
    private double length;
    private double hieght;
}

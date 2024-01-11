package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class EscalatorDTO implements Serializable {
    private int noOfStairs;
    private boolean electric;
    private String place;
    private String color;
}

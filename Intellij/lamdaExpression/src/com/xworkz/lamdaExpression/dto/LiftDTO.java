package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@Setter@AllArgsConstructor@NoArgsConstructor@ToString@Getter
public class LiftDTO implements Serializable {

    private int capacity;
    private String place;
    private int noOfFloors;

    private boolean doubleDoor;
}

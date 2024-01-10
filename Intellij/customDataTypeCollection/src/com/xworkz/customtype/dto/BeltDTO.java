package com.xworkz.customtype.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class BeltDTO implements Serializable {
    private double length;
    private String color;
    private int quantity;
    private int size;

}

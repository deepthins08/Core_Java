package com.xworkz.customtype.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class CharcolDTO implements Serializable {

    private int quantity;
    private String type;
    private String brand;
    private double cost;

}

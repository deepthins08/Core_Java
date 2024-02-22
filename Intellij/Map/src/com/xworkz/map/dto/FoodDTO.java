package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class FoodDTO implements Serializable {

    private String name;
    private boolean spicy;
    private double price;
}

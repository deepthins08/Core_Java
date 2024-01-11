package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class ShipDTO implements Serializable {
    private String name;
    private String color;
    private String location;
    private String type;
}

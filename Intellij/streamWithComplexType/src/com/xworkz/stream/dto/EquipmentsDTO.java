package com.xworkz.stream.dto;

import lombok.*;

import java.io.Serializable;
@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class EquipmentsDTO implements Serializable {

    private String name;
    private String type;
    private double price;
}

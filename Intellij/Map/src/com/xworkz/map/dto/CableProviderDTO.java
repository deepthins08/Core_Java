package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class CableProviderDTO implements Serializable {

    private String name;
    private String area;
    private double cost;
}

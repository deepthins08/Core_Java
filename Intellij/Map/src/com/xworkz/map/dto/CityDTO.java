package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class CityDTO implements Serializable {

    private String name;
    private double population;

    private boolean capitalCity;

}

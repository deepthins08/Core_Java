package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class FireCrackerDTO implements Serializable,Comparable<FireCrackerDTO> {

    private String name;
    private Double cost;
    private String color;
    @Override
    public int compareTo(FireCrackerDTO o) {
        return this.getName().compareTo(o.getColor());
    }
}

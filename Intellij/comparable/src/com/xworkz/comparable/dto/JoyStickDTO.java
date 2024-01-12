package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor@NoArgsConstructor@Setter@Getter@ToString
public class JoyStickDTO implements Serializable,Comparable<JoyStickDTO> {

    private String color;
    private Double cost;
    private Boolean wired;
    @Override
    public int compareTo(JoyStickDTO o) {
        return Double.compare(this.getCost(),o.getCost());
    }
}

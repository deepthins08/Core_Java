package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor@Getter@Setter@NoArgsConstructor@ToString
public class RopeDTO implements Serializable,Comparable<RopeDTO> {

    private String type;
    private Double cost;
    private Double length;

    @Override
    public int compareTo(RopeDTO o) {
        return this.getType().compareTo(o.getType());
    }
}

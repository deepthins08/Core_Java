package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class NeedleDTO implements Serializable,Comparable<NeedleDTO> {

    private String type;
    private Character size;
    private Double cost;
    @Override
    public int compareTo(NeedleDTO o) {
        return this.getType().compareTo(o.getType());
    }
}

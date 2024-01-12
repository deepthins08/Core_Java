package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Setter@ToString@Getter@NoArgsConstructor@AllArgsConstructor
public class WingsDTO implements Serializable,Comparable<WingsDTO> {
    private String color;
    private String type;
    private Boolean feather;

    @Override
    public int compareTo(WingsDTO o) {
        return this.getType().compareTo(o.getType());
    }
}

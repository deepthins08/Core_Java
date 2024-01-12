package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@ToString@AllArgsConstructor@NoArgsConstructor@Setter@Getter
public class PinDTO implements Serializable,Comparable<PinDTO> {
    private String type;
    private String color;
    private Integer quantity;

    @Override
    public int compareTo(PinDTO o) {
        return this.getType().compareTo(o.getType());
    }
}

package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@AllArgsConstructor@NoArgsConstructor@ToString@Setter
public class ToyDTO implements Serializable, Comparable<ToyDTO> {

    private String name;
    private String type;
    private Double cost;
    @Override
    public int compareTo(ToyDTO o) {
        return this.getName().compareTo(o.getName());
    }
}

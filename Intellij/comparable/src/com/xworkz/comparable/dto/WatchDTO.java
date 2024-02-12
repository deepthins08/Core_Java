package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class WatchDTO implements Serializable, Comparable<WatchDTO> {

    private String brand;
    private double price;
    private String type;
    private boolean waterResistance;


    @Override
    public int compareTo(WatchDTO o) {
        return Double.compare(this.getPrice(),o.getPrice());
    }
}

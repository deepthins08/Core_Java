package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class PlayGroundDTO implements Serializable,Comparable<PlayGroundDTO> {

    private String place;
    private String name;
    private double areaInMeter;
    private String type;


    @Override
    public int compareTo(PlayGroundDTO o) {
        return Double.compare(this.getAreaInMeter(),o.getAreaInMeter());
    }
}

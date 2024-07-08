package com.xworkz.serialization.dto;

import lombok.*;

import java.io.Serializable;

@Getter@ToString@Setter@AllArgsConstructor@NoArgsConstructor
public class AlarmDTO implements Serializable,Comparable<AlarmDTO>{

    private String type;
    private String shape;
    private double time;


    @Override
    public int compareTo(AlarmDTO o) {
        return Double.compare(this.getTime(),o.getTime());
    }
}

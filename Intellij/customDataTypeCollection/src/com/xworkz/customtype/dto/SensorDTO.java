package com.xworkz.customtype.dto;

import lombok.*;
import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString


public class SensorDTO implements Serializable {

    private String name;
    private String type;
    private double cost;
    private int distance;



}

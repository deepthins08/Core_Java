package com.xworkz.customtype.dto;

import lombok.*;

import java.io.Serializable;
@ToString@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class CoverDTO implements Serializable {

    private String type;
    private double cost;
    private String color;
    private boolean thickness;
}

package com.xworkz.customtype.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class SpeakerDTO implements Serializable {

    private String name;
    private int warranty;
    private double cost;
    private boolean bluetooth;
}

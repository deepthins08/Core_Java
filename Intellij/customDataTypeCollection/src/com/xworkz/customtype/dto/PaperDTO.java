package com.xworkz.customtype.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class PaperDTO implements Serializable {

    private String type;
    private double cost;
    private double size;
    private String color;
}

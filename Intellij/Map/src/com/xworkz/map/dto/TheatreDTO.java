package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
@Setter@Getter@ToString@NoArgsConstructor@AllArgsConstructor
public class TheatreDTO implements Serializable {

    private String name;
    private String place;
    private String movie;
}

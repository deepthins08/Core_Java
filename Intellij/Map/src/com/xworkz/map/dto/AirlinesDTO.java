package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
@ToString@NoArgsConstructor@AllArgsConstructor@Getter@Setter
public class AirlinesDTO implements Serializable {

    private String planeName;
    private String source;
    private String destination;
}

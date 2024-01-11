package com.xworkz.lamdaExpression.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class StreetDTO implements Serializable {

    private String name;
    private String city;
    private String state;
    private String country;
}

package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class AddressDTO implements Serializable {

    private int no;
    private double pincode;
    private String street;
}

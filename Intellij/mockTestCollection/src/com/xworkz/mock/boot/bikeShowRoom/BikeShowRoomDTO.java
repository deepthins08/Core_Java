package com.xworkz.mock.boot.bikeShowRoom;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class BikeShowRoomDTO implements Serializable {

    private String name;
    private String city;
    private double pincode;

}

package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor@NoArgsConstructor@Getter@ToString@Setter
public class AirportDTO implements Serializable {

    private String name;
    private String place;
    private String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirportDTO)) return false;
        AirportDTO that = (AirportDTO) o;
        return Objects.equals(name, that.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

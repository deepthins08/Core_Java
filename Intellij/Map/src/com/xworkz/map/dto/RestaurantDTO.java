package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Setter@AllArgsConstructor@NoArgsConstructor@ToString@Getter
public class RestaurantDTO implements Serializable {

    private String name;
    private String place;
    private int ratingOutOf5;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestaurantDTO)) return false;
        RestaurantDTO that = (RestaurantDTO) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

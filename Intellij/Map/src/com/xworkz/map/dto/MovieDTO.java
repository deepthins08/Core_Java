package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;
@AllArgsConstructor@NoArgsConstructor@ToString@Getter@Setter
public class MovieDTO implements Serializable {

    private String name;
    private String directorName;
    private double budget;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieDTO)) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return  Objects.equals(directorName, movieDTO.directorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDirectorName());
    }
}

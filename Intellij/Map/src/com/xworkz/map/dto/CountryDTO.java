package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class CountryDTO implements Serializable {

    private String name;
    private String continent;
    private String religion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryDTO)) return false;
        CountryDTO that = (CountryDTO) o;
        return Objects.equals(name, that.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

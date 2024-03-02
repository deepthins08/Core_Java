package com.xworkz.mock.boot.food;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class FoodDTO implements Serializable {

   private String name;

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof FoodDTO)) return false;
      FoodDTO foodDTO = (FoodDTO) o;
      return Objects.equals(name, foodDTO.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(getName());
   }
}

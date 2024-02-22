package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class PersonDTO implements Serializable {

   private String name;
   private String email;

    @Override
    public boolean equals(Object obj) {
       PersonDTO personleft=this;
       if(obj!=null){
           if(obj instanceof PersonDTO){
               PersonDTO personRight=(PersonDTO) obj;
               if(personleft.getEmail().equals(personRight.getEmail())){

                   return true;
               }
           }
       }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }
}

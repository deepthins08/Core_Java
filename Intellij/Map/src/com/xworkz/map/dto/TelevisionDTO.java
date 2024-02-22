package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class TelevisionDTO implements Serializable {

    private String brand;
    private double price;
    private int id;


    @Override
    public boolean equals(Object o) {
        TelevisionDTO telLeft=this;
        if(o!=null){
            if(o instanceof TelevisionDTO){
                TelevisionDTO telRight=(TelevisionDTO) o;
                if(telLeft.getBrand().equals(telRight.getBrand())){

                    return true;
                }
            }
        }

        return false;   }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand());
    }
}



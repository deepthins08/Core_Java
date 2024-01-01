package com.xworkz.cloning.product;

import lombok.*;
@ToString@AllArgsConstructor@NoArgsConstructor@Setter@Getter
public class Scanner implements Cloneable{

    private String name;
    private double cost;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

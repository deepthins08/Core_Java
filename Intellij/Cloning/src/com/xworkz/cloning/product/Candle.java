package com.xworkz.cloning.product;
import lombok.*;
@ToString@AllArgsConstructor@NoArgsConstructor@Setter@Getter
public class Candle implements Cloneable{

    private String color;
    private double cost;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

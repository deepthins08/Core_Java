package com.xworkz.cloning.product;
import lombok.*;
@ToString@AllArgsConstructor@NoArgsConstructor@Setter@Getter
public class Light implements Cloneable{
    private String type;
    private double cost;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

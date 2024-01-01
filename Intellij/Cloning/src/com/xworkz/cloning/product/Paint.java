package com.xworkz.cloning.product;
import lombok.*;
@ToString@AllArgsConstructor@NoArgsConstructor@Setter@Getter
public class Paint implements Cloneable{

    private String color;
    private int noOfBrush;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

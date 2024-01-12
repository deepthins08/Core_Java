package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor@Setter@Getter@NoArgsConstructor@ToString
public class CardBoardDTO implements Serializable,Comparable<CardBoardDTO> {

    private String color;
    private Double cost;
    private Character size;

    @Override
    public int compareTo(CardBoardDTO o) {
        return this.getColor().compareTo(o.getColor());
    }
}

package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@ToString@NoArgsConstructor@AllArgsConstructor@Setter@Getter
public class ThreadDTO implements Serializable,Comparable<ThreadDTO> {

    private String color;
    private Integer quantity;
    private String type;

    @Override
    public int compareTo(ThreadDTO o) {
        return this.getType().compareTo(o.getType());
    }
}

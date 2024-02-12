package com.xworkz.comparable.dto;

import lombok.*;

import java.io.Serializable;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {

    private String name;
    private String type;
    private String symptom;
    private String patientName;

    @Override
    public int compareTo(DiseaseDTO o) {
        return this.getPatientName().compareTo(o.getPatientName());
    }
}

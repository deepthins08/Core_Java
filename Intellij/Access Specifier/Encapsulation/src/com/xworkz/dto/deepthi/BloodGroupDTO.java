package com.xworkz.dto.deepthi;

import java.io.Serializable;

public class BloodGroupDTO implements Serializable {
    private String bloodGroup;
    private String patientName;
    private double noOfHemoglobin;
    private double noOfRedBloodCells;
    private double noOfWhiteBloodCells;
    private long patinetPhNo;
    private String patientAddress;
    private String patientGender;
    private int patientAge;
    private String refByDoctor;

    public BloodGroupDTO(){

    }

    public double getNoOfHemoglobin() {
        return noOfHemoglobin;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public double getNoOfRedBloodCells() {
        return noOfRedBloodCells;
    }

    public double getNoOfWhiteBloodCells() {
        return noOfWhiteBloodCells;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public String getPatientName() {
        return patientName;
    }

    public long getPatinetPhNo() {
        return patinetPhNo;
    }

    public String getRefByDoctor() {
        return refByDoctor;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setNoOfHemoglobin(double noOfHemoglobin) {
        this.noOfHemoglobin = noOfHemoglobin;
    }

    public void setNoOfRedBloodCells(double noOfRedBloodCells) {
        this.noOfRedBloodCells = noOfRedBloodCells;
    }

    public void setNoOfWhiteBloodCells(double noOfWhiteBloodCells) {
        this.noOfWhiteBloodCells = noOfWhiteBloodCells;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public void setPatinetPhNo(long patinetPhNo) {
        this.patinetPhNo = patinetPhNo;
    }

    public void setRefByDoctor(String refByDoctor) {
        this.refByDoctor = refByDoctor;
    }

    @Override
    public boolean equals(Object obj) {

        BloodGroupDTO bloodGroupDTO=this;
        if(obj!=null){
            if(obj instanceof BloodGroupDTO){
                BloodGroupDTO bloodGroupDTO1=(BloodGroupDTO) obj;
                if(bloodGroupDTO.bloodGroup.equals(bloodGroupDTO1.bloodGroup)&& bloodGroupDTO.patientName.equals(bloodGroupDTO1.patientName) && bloodGroupDTO.patientGender.equals(bloodGroupDTO1.patientGender) && bloodGroupDTO.patientAge==bloodGroupDTO1.patientAge){
                    System.out.println("Both the patients are same with same blod group");
                    return  true;

                }
                else{
                    System.err.println("both blood groups are different");
                }
            }
        }
        else{
            System.err.println("Null should not be passed");
        }
        return false;
    }

    @Override
    public String toString() {
        return "BloodGroupDTO{" +
                "bloodGroup='" + bloodGroup + '\'' +
                ", patientName='" + patientName + '\'' +
                ", noOfHemoglobin=" + noOfHemoglobin +
                ", noOfRedBloodCells=" + noOfRedBloodCells +
                ", noOfWhiteBloodCells=" + noOfWhiteBloodCells +
                ", patinetPhNo='" + patinetPhNo + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientGender='" + patientGender + '\'' +
                ", patientAge=" + patientAge +
                ", refByDoctor='" + refByDoctor + '\'' +
                '}';
    }
}

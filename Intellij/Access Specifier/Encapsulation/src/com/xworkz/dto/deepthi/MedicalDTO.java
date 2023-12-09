package com.xworkz.dto.deepthi;

import java.io.Serializable;

public class MedicalDTO implements Serializable {

    private String medicalShopName;
    private String ownerName;
    private String ownerQualification;
    private int ownerAge;
    private boolean licensed;
    private String hospitalName;
    private String suggestedDoctor;
    private String location;
    private int noOfBranches;
    private boolean good;

    public MedicalDTO(){

    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getLocation() {
        return location;
    }

    public int getNoOfBranches() {
        return noOfBranches;
    }

    public String getMedicalShopName() {
        return medicalShopName;
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerQualification() {
        return ownerQualification;
    }

    public String getSuggestedDoctor() {
        return suggestedDoctor;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public void setNoOfBranches(int noOfBranches) {
        this.noOfBranches = noOfBranches;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }

    public void setMedicalShopName(String medicalShopName) {
        this.medicalShopName = medicalShopName;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerQualification(String ownerQualification) {
        this.ownerQualification = ownerQualification;
    }

    public void setSuggestedDoctor(String suggestedDoctor) {
        this.suggestedDoctor = suggestedDoctor;
    }


    @Override
    public boolean equals(Object obj) {

        MedicalDTO medicalDTO=this;
        if(obj!=null){
            if(obj instanceof MedicalDTO){
                MedicalDTO medicalDTO1=(MedicalDTO) obj;
                if(medicalDTO.medicalShopName.equals(medicalDTO1.medicalShopName) && medicalDTO.ownerName.equals(medicalDTO1.ownerName)&& medicalDTO.ownerAge==medicalDTO1.ownerAge && medicalDTO.ownerQualification.equals(medicalDTO1.ownerQualification)){
                    System.out.println("Medical shop are same");
                    return true;
                }
                else{
                    System.err.println("medical shop are not same");
                }
            }
        }
        else {
            System.err.println("Null should not to be passed");
        }

        return false;
    }

    @Override
    public String toString() {
        return "MedicalDTO{" +
                "medicalShopName='" + medicalShopName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerQualification='" + ownerQualification + '\'' +
                ", ownerAge='" + ownerAge + '\'' +
                ", licensed=" + licensed +
                ", hospitalName='" + hospitalName + '\'' +
                ", suggestedDoctor='" + suggestedDoctor + '\'' +
                ", location='" + location + '\'' +
                ", noOfBranches=" + noOfBranches +
                ", good=" + good +
                '}';
    }
}

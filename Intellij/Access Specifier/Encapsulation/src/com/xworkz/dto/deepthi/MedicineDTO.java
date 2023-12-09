package com.xworkz.dto.deepthi;

import java.io.Serializable;

public class MedicineDTO implements Serializable {

    private String medicineName;
    private String dosage;
    private String usedFor;
    private double cost;
    private String companyName;
    private String manufactureDate;
    private String expiryDate;
    private int noOfMedicineInASheet;
    private String origin;
    private boolean sideEffect;

    public MedicineDTO(){

    }

    public double getCost() {
        return cost;
    }

    public int getNoOfMedicineInASheet() {
        return noOfMedicineInASheet;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDosage() {
        return dosage;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setNoOfMedicineInASheet(int noOfMedicineInASheet) {
        this.noOfMedicineInASheet = noOfMedicineInASheet;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setSideEffect(boolean sideEffect) {
        this.sideEffect = sideEffect;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }


    @Override
    public boolean equals(Object obj) {
        MedicineDTO medicineDTO =this;
        if(obj!=null){
            if(obj instanceof MedicineDTO){
                MedicineDTO medicineDTO1 =(MedicineDTO) obj;
                if(medicineDTO.medicineName.equals(medicineDTO1.medicineName) && medicineDTO.companyName.equals(medicineDTO1.companyName) && medicineDTO.usedFor.equals(medicineDTO1.usedFor)&& medicineDTO.sideEffect== medicineDTO1.sideEffect){
                    System.out.println("Both the medicines are same");
                    return true;

                }
                else{
                    System.err.println("Both the medicines are different");
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
        return "MedicalDTO{" +
                "medicineName='" + medicineName + '\'' +
                ", dosage='" + dosage + '\'' +
                ", usedFor='" + usedFor + '\'' +
                ", cost=" + cost +
                ", companyName='" + companyName + '\'' +
                ", manufactureDate='" + manufactureDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", noOfMedicineInASheet=" + noOfMedicineInASheet +
                ", origin='" + origin + '\'' +
                ", sideEffect=" + sideEffect +
                '}';
    }
}

package com.xworkz.dto.deepthi;

import java.io.Serializable;
import java.util.Objects;

public class PatientDTO implements Serializable {

    private String patientName;
    private int patientAge;
    private String patientGuardianName;
    private long patientPhNo;

    private String disease;
    private String doctorName;
    private int bedNo;
    private double patientFee;
    private String hospitalName;
    private String patientAddress;

    public PatientDTO(){

    }

    public String getPatientName(){
        return this.patientName;
    }

    public int getPatientAge() {
        return this.patientAge;
    }

    public long getPatientPhNo() {
        return patientPhNo;
    }

    public String getDisease() {
        return disease;
    }

    public String getPatientGuardianName() {
        return patientGuardianName;
    }

    public double getPatientFee() {
        return patientFee;
    }

    public int getBedNo() {
        return bedNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public void setPatientGuardianName(String patientGuardianName) {
        this.patientGuardianName = patientGuardianName;
    }

    public void setPatientFee(double patientFee) {
        this.patientFee = patientFee;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientPhNo(long patientPhNo) {
        this.patientPhNo = patientPhNo;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    @Override
    public boolean equals(Object obj) {
        PatientDTO patientDTO = this;
        if (obj != null) {
            if (obj instanceof PatientDTO) {
                PatientDTO patientDTO1=(PatientDTO) obj;
                if(patientDTO.patientName.equals(patientDTO1.patientName) && patientDTO.patientAge==patientDTO1.patientAge && patientDTO.bedNo==patientDTO1.bedNo){
                    System.out.println("Both patients are same");
                    return  true;
                }
                else{
                    System.err.println("Both patients are not same");
                }
            }
        }
        else{
            System.err.println("Null should not be passed");
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(patientName, patientAge, patientGuardianName, patientPhNo, disease, doctorName, bedNo, patientFee, hospitalName, patientAddress);
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientGuardianName='" + patientGuardianName + '\'' +
                ", patientPhNo=" + patientPhNo +
                ", disease='" + disease + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", bedNo=" + bedNo +
                ", patientFee=" + patientFee +
                ", hospitalName='" + hospitalName + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                '}';
    }
}

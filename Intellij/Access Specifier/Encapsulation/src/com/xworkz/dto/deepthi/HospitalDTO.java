package com.xworkz.dto.deepthi;

import java.io.Serializable;

public class HospitalDTO implements Serializable {

    public HospitalDTO(){

    }
    private String hospitalName;
    private String location;
    private int noOfBranches;
    private int noOfPatients;
    private int noOfDoctors;
    private int noOfNurses;
    private int noOfAmbulances;
    private String branchName;
    private String deanName;
    private boolean good;


    public String getHospitalName(){
        return this.hospitalName;
    }

    public void setHospitalName(String hospitalName){
        this.hospitalName=hospitalName;
    }

    public int getNoOfAmbulances() {
        return noOfAmbulances;
    }

    public int getNoOfBranches() {
        return noOfBranches;
    }

    public int getNoOfDoctors() {
        return noOfDoctors;
    }

    public int getNoOfNurses() {
        return noOfNurses;
    }

    public int getNoOfPatients() {
        return noOfPatients;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getLocation() {
        return location;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNoOfAmbulances(int noOfAmbulances) {
        this.noOfAmbulances = noOfAmbulances;
    }

    public void setNoOfBranches(int noOfBranches) {
        this.noOfBranches = noOfBranches;
    }

    public void setNoOfDoctors(int noOfDoctors) {
        this.noOfDoctors = noOfDoctors;
    }

    public void setNoOfPatients(int noOfPatients) {
        this.noOfPatients = noOfPatients;
    }

    @Override
    public boolean equals(Object obj) {

       HospitalDTO hospitalDTO=this;
       if(obj!=null){
             HospitalDTO hospitalDTO1=(HospitalDTO) obj;
             if(hospitalDTO.hospitalName.equals(hospitalDTO1.hospitalName) && hospitalDTO.location.equals(hospitalDTO1.location) && hospitalDTO.deanName.equals(hospitalDTO1.deanName)){
                 System.out.println("Both the hospitals are same");
                 return true;
             }

             else{
                 System.err.println("Both hositals are not same");
             }
       }

        System.err.println("Null is not accessed");
        return false;
    }

    @Override
    public String toString() {
        return "HospitalDTO{" +
                "hospitalName='" + hospitalName + '\'' +
                ", location='" + location + '\'' +
                ", noOfBranches=" + noOfBranches +
                ", noOfPatients=" + noOfPatients +
                ", noOfDoctors=" + noOfDoctors +
                ", noOfNurses=" + noOfNurses +
                ", noOfAmbulances=" + noOfAmbulances +
                ", branchName='" + branchName + '\'' +
                ", deanName='" + deanName + '\'' +
                ", good=" + good +
                '}';
    }

    public void setNoOfNurses(int noOfNurses) {
        this.noOfNurses = noOfNurses;
    }

    public void setGood(boolean good) {
        this.good = good;
    }
}

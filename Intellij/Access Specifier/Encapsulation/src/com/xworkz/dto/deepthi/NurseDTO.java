package com.xworkz.dto.deepthi;

public class NurseDTO {

    private String nurseName;
    private String qualification;
    private int experience;
    private double salary;
    private String hospitalName;
    private String hospitalLocation;
    private int noOfPatientsHandling;
    private boolean license;
    private long phNo;
    private String address;

    public NurseDTO(){

    }

    public String getHospitalName() {
        return hospitalName;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public int getNoOfPatientsHandling() {
        return noOfPatientsHandling;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public String getNurseName() {
        return nurseName;
    }

    public long getPhNo() {
        return phNo;
    }

    public String getQualification() {
        return qualification;
    }

    public String getAddress() {
        return address;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public void setNoOfPatientsHandling(int noOfPatientsHandling) {
        this.noOfPatientsHandling = noOfPatientsHandling;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        NurseDTO nurseDTO=this;
        if(obj!=null) {
            if (obj instanceof NurseDTO) {
                NurseDTO nurseDTO1 = (NurseDTO) obj;
                if(nurseDTO.nurseName.equals(nurseDTO1.nurseName) && nurseDTO.hospitalName.equals(nurseDTO1.hospitalName) && nurseDTO.phNo==nurseDTO1.phNo){
                    System.out.println("Both the nurses are same");
                }
                else{
                    System.err.println("Both nurses are different");
                }
            }
        }
        else{
            System.err.println("Null not be passed");
        }

        return false;
    }

    @Override
    public String toString() {
        return "NurseDTO{" +
                "nurseName='" + nurseName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalLocation='" + hospitalLocation + '\'' +
                ", noOfPatientsHandling=" + noOfPatientsHandling +
                ", license=" + license +
                ", phNo=" + phNo +
                ", address='" + address + '\'' +
                '}';
    }
}

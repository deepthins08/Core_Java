package com.xworkz.dto.runner;

import com.xworkz.dto.deepthi.*;

public class HospitalDTORunner {
    public static void main(String[] args) {

        System.out.println("Strating main in HospitalDTORunner");
        HospitalDTO hospitalDTO=new HospitalDTO();
        hospitalDTO.setHospitalName("Bapuji");
        hospitalDTO.setBranchName("Stadium Branch");
        hospitalDTO.setNoOfAmbulances(10);
        hospitalDTO.setNoOfDoctors(100);
        hospitalDTO.setNoOfNurses(200);
        hospitalDTO.setNoOfBranches(3);
        hospitalDTO.setNoOfPatients(300);
        hospitalDTO.setLocation("Davangere");
        hospitalDTO.setDeanName("Shivshankarappa");

        System.out.println(hospitalDTO);

        PatientDTO patientDTO=new PatientDTO();
        patientDTO.setBedNo(202);
        patientDTO.setDisease("Stomach Ulcer");
        patientDTO.setPatientAddress("Banglore");
        patientDTO.setPatientAge(54);
        patientDTO.setPatientName("Micheal");
        patientDTO.setPatientFee(4000);
        patientDTO.setPatientPhNo(7387338780L);
        patientDTO.setHospitalName("Manipal");
        patientDTO.setDoctorName("Stephen");
        patientDTO.setPatientGuardianName("Sophi");
        System.out.println(patientDTO);

        NurseDTO nurseDTO=new NurseDTO();
        nurseDTO.setNurseName("Margarita");
        nurseDTO.setExperience(4);
        nurseDTO.setAddress("BTM");
        nurseDTO.setHospitalLocation("Jaynagar");
        nurseDTO.setLicense(true);
        nurseDTO.setNoOfPatientsHandling(10);
        nurseDTO.setPhNo(8212872822L);
        nurseDTO.setQualification("BSc in Nursing");
        nurseDTO.setSalary(18000);
        System.out.println(nurseDTO);

        MedicineDTO medicineDTO =new MedicineDTO();
        medicineDTO.setNoOfMedicineInASheet(30);
        medicineDTO.setCost(400);
        medicineDTO.setDosage("2 capsule per day");
        medicineDTO.setCompanyName("Medcore pharma");
        medicineDTO.setOrigin("India");
        medicineDTO.setExpiryDate("17/08/2025");
        medicineDTO.setManufactureDate("12/03/2022");
        medicineDTO.setSideEffect(true);
        medicineDTO.setMedicineName("Paracetamol");
        medicineDTO.setUsedFor("Fever and body pains");
        System.out.println(medicineDTO);

        BloodGroupDTO bloodGroupDTO=new BloodGroupDTO();
        bloodGroupDTO.setBloodGroup("AB+");
        bloodGroupDTO.setPatientName("alexa");
        bloodGroupDTO.setPatientAge(23);
        bloodGroupDTO.setPatientGender("Female");
        bloodGroupDTO.setPatinetPhNo(8389380388L);
        bloodGroupDTO.setPatientAddress("Rajajinagar");
        bloodGroupDTO.setRefByDoctor("Franklin");
        bloodGroupDTO.setNoOfHemoglobin(10);
        bloodGroupDTO.setNoOfRedBloodCells(21);
        bloodGroupDTO.setNoOfWhiteBloodCells(75);
        System.out.println(bloodGroupDTO);

        MedicalDTO medicalDTO=new MedicalDTO();
        medicalDTO.setGood(true);
        medicalDTO.setHospitalName("Good Will Hospital");
        medicalDTO.setLicensed(true);
        medicalDTO.setLocation("Banglore");
        medicalDTO.setNoOfBranches(20);
        medicalDTO.setMedicalShopName("Appolo");
        medicalDTO.setOwnerName("Damon");
        medicalDTO.setOwnerAge(39);
        medicalDTO.setOwnerQualification("B Pharmacy");
        medicalDTO.setSuggestedDoctor("Dhruv");
        System.out.println(medicalDTO);

        System.out.println("Ending main in HospitalDTORunner");
    }
}

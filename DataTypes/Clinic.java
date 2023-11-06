class Clinic{
	
	String specialization;
	int totalBeds;
	int totalPatients;
	Doctor doctor;
	
	void displayInfo(Doctor doctor){
		this.doctor=doctor;
	System.out.println("specialization is "+this.specialization);
	System.out.println("totalBeds are "+this.totalBeds);
	System.out.println("totalPatients are "+this.totalPatients);
	System.out.println("Doctor "+this.doctor);
	if(doctor!=null){
	System.out.println("doctor name is "+this.doctor.name);
	System.out.println("doctor experience is "+this.doctor.experience);
	System.out.println("doctor is fake or real  "+this.doctor.fake);
	System.out.println("doctor fee  "+this.doctor.fee);
	}
	}
	
}
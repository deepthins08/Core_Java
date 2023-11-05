class Clinic{
	
	String specialization;
	int totalBeds;
	int totalPatients;
	Doctor doctor;
	
	void displayInfo(Doctor doctor){
		this.doctor=doctor;
	System.out.println("specialization is "+specialization);
	System.out.println("totalBeds are "+totalBeds);
	System.out.println("totalPatients are "+totalPatients);
	System.out.println("doctor name is "+doctor.name);
	System.out.println("doctor experience is "+doctor.experience);
	System.out.println("doctor is fake or real  "+doctor.fake);
	System.out.println("doctor fee  "+doctor.fee);
	
	}
	
}
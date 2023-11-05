class ClinicStarter{
	
	public static void main(String[] patients){
		
		System.out.println("Starting main in ClinicStarter");
		Doctor doctor = new Doctor();
		Clinic clinic=new Clinic();
		
		clinic.specialization="Children";
		String specialization=clinic.specialization;
		clinic.totalBeds=20;
		int totalBeds=clinic.totalBeds;
		clinic.totalPatients=15;
		int totalPatients=clinic.totalPatients;
		
		doctor.name="Thomos";
		String name=doctor.name;
		doctor.experience=5;
		int experience=doctor.experience;
		doctor.fake=false;
		boolean fake=doctor.fake;
		doctor.fee=300;
		double fee=doctor.fee;
		
		clinic.displayInfo(doctor);
		
		
		System.out.println("Starting main in ClinicStarter");
	}
}
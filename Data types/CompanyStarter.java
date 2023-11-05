class CompanyStarter{
	
	public static void main(String[] details){
		
		System.out.println("Starting main in CompanyStarter");
		
		Job job=new Job();
		 
		Company company=new Company();
		System.out.println("job role is "+job.role);
		System.out.println("job salary is "+job.salary);
		System.out.println("job type is "+job.type);
		
		company.display(job);
		
		System.out.println("Starting main in CompanyStarter");
	}
}
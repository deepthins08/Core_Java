class CompanyStarter{
	
	public static void main(String[] details){
		
		System.out.println("Starting main in CompanyStarter");
		
		Job job=new Job();
		 
		Company company=new Company();
		
		
		company.display(job);
		
		System.out.println("Starting main in CompanyStarter");
	}
}
class Company{
	
	String name="TCS";
	double gstNo=77;
	String location="Banglore";
	Job job;
	
	void display(Job job){
		this.job=job;
		System.out.println("Company name is "+name);
		System.out.println("Company gstNo is "+gstNo);
		
		System.out.println("Company location is "+location);
		
		if(job!=null){
		System.out.println("job role is "+this.job.role);	
		System.out.println(" salary is "+this.job.salary);	
        System.out.println("job type is "+this.job.type);			
		}
	}
}
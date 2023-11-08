class Email{
	
	Domain domain;
	String id;
	String fname;
	String lastName;
	
	Email(){
		
		System.out.println("Created Email with no argument constructor");
	}
	
	void setEmail(Domain domain,String id,String fname,String lastName){
		
		this.domain=domain;
		this.id=id;
		this.fname=fname;
		this.lastName=lastName;
		
	}
	
	void showInfo(){
		
		System.out.println("Starting showInfo in Email");
		System.out.println("Email id is "+this.id);
		System.out.println("Email fname is "+this.fname);
		System.out.println("Email lastName is "+this.lastName);
		System.out.println("Email domain is "+this.domain);
		
		if(domain!=null){
			
			System.out.println("Email domain is "+this.domain.GMAIL);
			System.out.println("Email domain is "+this.domain.OUTLOOK);
		}
		
		System.out.println("Ending showInfo in Email");
	}
}
class Person{
	
	String name;
	String[] email;
	
	
	Person(){
		
		System.out.println("Created person with no arg constructor...");
	}
	
	void setMail(String[] email){
		this.email=email;
	}
	
	
	void showInfo(){
		
		System.out.println("Starting showInfo in Person");
		
		System.out.println("Person name is "+this.name);
		System.out.println("Person email is "+this.email);
		
		
		for(int index=0;index<email.length;index++){
			
			String ref=this.email[index];
			System.out.println("email "+ref);
			
			
		}
		
		System.out.println("Ending showInfo in Person");
	}
}
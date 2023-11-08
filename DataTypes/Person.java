class Person{
	
	String name;
	Email[] email;
	
	
	Person(String name,Email[] email){
		
		this.name=name;
		this.email=email;
		System.out.println("Created String,Email[] with arg constructor...");
	}
	
	
	void showInfo(){
		
		System.out.println("Starting showInfo in Person");
		
		System.out.println("Person name is "+this.name);
		System.out.println("Person email is "+this.email);
		
		
		for(int index=0;index<email.length;index++){
			
			Email ref=this.email[index];
			System.out.println("email "+ref);
			if(ref!=null){
			ref.showInfo();
			}
		}
		
		System.out.println("Ending showInfo in Person");
	}
}
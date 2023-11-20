class Project{
	
	Project(){
		
		System.out.println("Created no-arg const in Project");
	}
	
	void validate(Person person){
		
		System.out.println("Starting Displaying in validate");
		if(person!=null){
			
			person.sleep();
			
			if(person instanceof Developer){
				
				Developer developer=(Developer)person;
				developer.code();
			}
			
			if(person instanceof BusinessAnalyst){
				
				BusinessAnalyst businessanalyst=(BusinessAnalyst)person;
				businessanalyst.checkRequirement();
				
			}
			
			if(person instanceof ProductOwner){
				
				ProductOwner productowner=(ProductOwner)person;
				productowner.validate();
			}
			
			if(person instanceof Devops){
				
				Devops devops=(Devops)person;
				devops.runBuild();
			}
			
			if(person instanceof Tester){
				
				Tester tester=(Tester)person;
				tester.qualityCheck();
			}
			
			if(person instanceof DataBaseDeveloper){
				
				DataBaseDeveloper databasedeveloper=(DataBaseDeveloper)person;
				databasedeveloper.runScripts();
			}
		}
		
		System.out.println("Ending Displaying in validate");
	}
}
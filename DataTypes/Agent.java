class Agent{
	
	int id=22;
	String name="Voldemort";
	String companyName="Starz";
	
	
	void openTent(Tent tent){
		System.out.println("Starting openTent in Agent");
		System.out.println(tent.open());
		System.out.println(tent.slNo);
		System.out.println(tent.color);
		System.out.println(tent.width);
		System.out.println(tent.height);
		
		
		
		System.out.println("Ending openTent in Agent");
	}
	
	void closeTent(Tent tent){
		
		System.out.println("Starting closeTent in Agent");
		System.out.println(tent.close());
		System.out.println(tent.slNo);
		System.out.println(tent.color);
		System.out.println(tent.width);
		System.out.println(tent.height);
		
		System.out.println("Ending closeTent in Agent");
	}
	
	void showInfo(){
		
		
		System.out.println("Starting showInfo in Agent");
		System.out.println("Agent id is "+id);
		System.out.println("Agent name is "+name);
		System.out.println("Agent companyName is "+companyName);
		
		System.out.println("Ending showInfo in Agent");
	}
}
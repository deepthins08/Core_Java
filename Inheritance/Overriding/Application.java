class Application{
	
	double id;
	String name;
	AppType type;
	double version;
	String developer;
	String date;
	
	Application(String name,AppType type){
		this.name=name;
		this.type=type;
		System.out.println("created String,AppType arg const in Application");
		
	}
	
	void display(double id,double version,String developer,String date){
		
		this.id=id;
		this.version=version;
		this.developer=developer;
		this.date=date;
		
		System.out.println("Application id is "+this.id);
		System.out.println("Application version is "+this.version);
		System.out.println("Application developer "+this.id);
		System.out.println("Application date is "+this.id);
		System.out.println("Application name is  "+this.name);
		System.out.println("Application type is "+this.type);
		run();
		stop();
		execute();
		collectInfo();
		displayInfo();
	}
	
	void run(){
		
		System.out.println("Displaying run in Application");
	}
	
	void stop(){
		
		System.out.println("Displaying stop in Application");
	}
	
	void execute(){
		
		System.out.println("Displaying execute in Application");
	}
	
	void collectInfo(){
		
		System.out.println("Displaying collectInfo in Application");
	}
	
	void displayInfo(){
		
		System.out.println("Displaying displayInfo in Application");
	}
}
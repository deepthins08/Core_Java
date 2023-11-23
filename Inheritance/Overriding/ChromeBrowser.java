class ChromeBrowser extends Browser{
	
	ChromeBrowser(String name,AppType type){
		super(name,type);
		System.out.println("Created String,AppType constbin ChromeBrowser");
		
	}
	
	void override(){
		settings();
		displayHistory();
		consumerMemory();
		consumeInternet();
		run();
		stop();
		execute();
		collectInfo();
		displayInfo();
	}
	@Override
	void settings(){
		
		System.out.println("Displaying settings in ChromeBrowser");
	}
	
	@Override
	void displayHistory(){
		
		System.out.println("Displaying displayHistory in ChromeBrowser");
	}
	
	@Override
	void consumerMemory(){
		
		System.out.println("Displaying consumerMemory in ChromeBrowser");
	}
	
	@Override
	void consumeInternet(){
		System.out.println("Displaying consumeInternet in ChromeBrowser");
		
	}
	
	@Override
	void run(){
		
		System.out.println("Displaying run in ChromeBrowser");
	}
	
	@Override
	void stop(){
		
		System.out.println("Displaying stop in ChromeBrowser");
	}
	
	@Override
	void execute(){
		
		System.out.println("Displaying execute in ChromeBrowser");
	}
	
	@Override
	void collectInfo(){
		
		System.out.println("Displaying collectInfo in ChromeBrowser");
	}
	
	@Override
	void displayInfo(){
		
		System.out.println("Displaying displayInfo in ChromeBrowser");
	}
}
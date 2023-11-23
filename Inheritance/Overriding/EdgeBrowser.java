class EdgeBrowser extends Browser{
	
	EdgeBrowser(String name,AppType type){
		super(name,type);
		System.out.println("Created String,AppType constbin EdgeBrowser");
		
	}
	
	void overrideEdge(){
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
		
		System.out.println("Displaying settings in EdgeBrowser");
	}
	
	@Override
	void displayHistory(){
		
		System.out.println("Displaying displayHistory in EdgeBrowser");
	}
	
	@Override
	void consumerMemory(){
		
		System.out.println("Displaying consumerMemory in EdgeBrowser");
	}
	
	@Override
	void consumeInternet(){
		System.out.println("Displaying consumeInternet in EdgeBrowser");
		
	}
	
	@Override
	void run(){
		
		System.out.println("Displaying run in EdgeBrowser");
	}
	
	@Override
	void stop(){
		
		System.out.println("Displaying stop in EdgeBrowser");
	}
	
	@Override
	void execute(){
		
		System.out.println("Displaying execute in EdgeBrowser");
	}
	
	@Override
	void collectInfo(){
		
		System.out.println("Displaying collectInfo in EdgeBrowser");
	}
	
	@Override
	void displayInfo(){
		
		System.out.println("Displaying displayInfo in EdgeBrowser");
	}
}
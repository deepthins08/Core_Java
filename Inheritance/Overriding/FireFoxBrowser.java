class FireFoxBrowser extends Browser{
	
	FireFoxBrowser(String name,AppType type){
		super(name,type);
		System.out.println("Created String,AppType constbin FireFoxBrowser");
		overrideFox();
	}
	
	void overrideFox(){
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
		
		System.out.println("Displaying settings in FireFoxBrowser");
	}
	
	@Override
	void displayHistory(){
		
		System.out.println("Displaying displayHistory in FireFoxBrowser");
	}
	
	@Override
	void consumerMemory(){
		
		System.out.println("Displaying consumerMemory in FireFoxBrowser");
	}
	
	@Override
	void consumeInternet(){
		System.out.println("Displaying consumeInternet in FireFoxBrowser");
		
	}
	
	@Override
	void run(){
		
		System.out.println("Displaying run in FireFoxBrowser");
	}
	
	@Override
	void stop(){
		
		System.out.println("Displaying stop in FireFoxBrowser");
	}
	
	@Override
	void execute(){
		
		System.out.println("Displaying execute in FireFoxBrowser");
	}
	
	@Override
	void collectInfo(){
		
		System.out.println("Displaying collectInfo in FireFoxBrowser");
	}
	
	@Override
	void displayInfo(){
		
		System.out.println("Displaying displayInfo in FireFoxBrowser");
	}
}
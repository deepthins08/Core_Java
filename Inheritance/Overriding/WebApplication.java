class WebApplication extends Application{
	
	String[] supportedBrowsers;
	boolean free;
	
	WebApplication(String name,AppType type){
		super(name,type);
		System.out.println("Created String,name arg const in WebApplication");
		
	}
	
	void setBrowser(String[] supportedBrowsers){
		this.supportedBrowsers=supportedBrowsers;
		
		System.out.println("Displaying list of browsers");
		
		for(int index=0;index<this.supportedBrowsers.length;index++){
			
			String browser=this.supportedBrowsers[index];
			System.out.println("supportedBrowsers are "+browser);
		}
	}
	
	void information(boolean free){
		this.free=free;
		System.out.println("browser is free: "+this.free);
		
		connectInternet();
		sendUsage();
	}
	
	void connectInternet(){
		
		System.out.println("Displaying connectInternet in WebApplication");
	}
	
	void sendUsage(){
		
		System.out.println("Displaying sendUsage in WebApplication");
	}
	
}
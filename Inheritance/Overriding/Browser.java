class Browser extends StandaloneApplication{
	
	String[] downloads;
	String[] browsingHistory;
	
	
	Browser(String name,AppType type){
		super(name,type);
		System.out.println("Created String,AppType const in Browser ");
		
	}
	
	void setDownloads(String[] downloads){
		
		this.downloads=downloads;
		for(int seq=0;seq<downloads.length;seq++){
			
			String download=downloads[seq];
			System.out.println("downloads are "+downloads[seq]+" at seq"+seq);
		}
		
	}
	
	void setBrowsingHistory(String[] browsingHistory){
		this.browsingHistory=browsingHistory;
		for(int seq=0;seq<browsingHistory.length;seq++){
			
			String browse=browsingHistory[seq];
			System.out.println("browsingHistory are "+browsingHistory[seq]+" at seq"+seq);
		
	}
	}
	
	void info(){
		
		
		settings();
		displayHistory();
	}
	
	void settings(){
		System.out.println("Displaying settings in Browser");
		
	}
	
	void displayHistory(){
		System.out.println("Displaying displayHistory in Browser");
		
	}
	

}
class StandaloneApplication extends Application{
	
	int size;
	String compatabilewith;
	Os os;
	
	
	StandaloneApplication(String name,AppType type){
		
		super(name,type);
		System.out.println("created String,AppType arg const in StandaloneApplication");
		
	}
	
	void showing(int size,String compatabilewith,Os os){
		this.size=size;
		this.compatabilewith=compatabilewith;
		this.os=os;
		
		System.out.println("size of the StandaloneApplication is "+this.size);
		System.out.println("size of the StandaloneApplication is "+this.compatabilewith);
		System.out.println("size of the StandaloneApplication is "+this.os);
		
		consumerMemory();
		consumeInternet();
	}
	
	
	void consumerMemory(){
		
		System.out.println("Displaying consumerMemory in StandaloneApplication");
	}
	
	void consumeInternet(){
		System.out.println("Displaying consumeInternet in StandaloneApplication");
		
	}
	
}
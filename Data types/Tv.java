class Tv{
	
	String display;
	Speaker speaker;
	
	Tv(String display,Speaker speaker){
		this.display=display;
		this.speaker=speaker;
		
		
	}
	
	void showInfo(){
		
		System.out.println("display is :"+this.display);
		
		if(speaker!=null){
			System.out.println("maxVol is :"+this.speaker.maxVol);
		}
}
}
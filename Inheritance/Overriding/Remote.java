class Remote{
	
	Usage usedFor;
	int totalButtons;
	boolean original;
	
	Remote(int totalButtons,boolean original){
		this.totalButtons=totalButtons;
		this.original=original;
		System.out.println("int ,boolean arg const in Remote");
		
	}
	
	void setUsedFor(Usage usedFor){
		
		this.usedFor=usedFor;
		System.out.println("Remote is usedFor :"+this.usedFor);
	}
	
	void on(){
		
		System.out.println("Diisplaying on in Remote");
	}
	
	void off(){
		
		System.out.println("Diisplaying off in Remote");
	}
	
	void increaseVolume(){
		System.out.println("Diisplaying increaseVolume in Remote");
		
	}
	
	void decreaseVolume(){
		System.out.println("Diisplaying decreaseVolume in Remote");
		
	}
	
	void changeChannel(){
		
		System.out.println("Displaying changeChaneel in Remote");
	}
	
	
}
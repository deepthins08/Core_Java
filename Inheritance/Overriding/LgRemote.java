class LgRemote extends Remote{
	
	int warranty;
	int totalBatteries;
	
	LgRemote(int totalButtons,boolean original){
		
		super(totalButtons,original);
		System.out.println("int,boolean arg const in LgRemote");
	}
	
	void setValues(int warranty,int totalBatteries){
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
		System.out.println("warranty is "+this.warranty);
		System.out.println("totalBatteries are "+this.totalBatteries);
	}
	
	void voiceCommand(){
		
		System.out.println("Displaying voiceCommand in LgRemote");
	}
}
class Owner{
	
	String name;
	Address permanantAddress;
	Address temporaryAddress;
	
	Owner(){
		System.out.println("created Owner using no arg const....");
	}
	
	void setPermanantAddress(Address permanantAddress){
		
		this.permanantAddress=permanantAddress;
	}
	
	void setTemporaryAddress(Address temporaryAddress){
		this.temporaryAddress=temporaryAddress;
	}
	
	void show(){
		
		System.out.println("Starting show in Owner");
		System.out.println("Owner name is "+this.name);
		System.out.println("Owner name is "+this.permanantAddress);
		if(permanantAddress!=null){
			//System.out.println("Owner name is "+this.permanantAddress.street);
			//System.out.println("Owner name is "+this.permanantAddress.pincode);
			//System.out.println("Owner name is "+this.permanantAddress.city);
			permanantAddress.show();
		}
		System.out.println("Owner name is "+this.temporaryAddress);
		if(temporaryAddress!=null){
			//System.out.println("Owner name is "+this.temporaryAddress.street);
			//System.out.println("Owner name is "+this.temporaryAddress.pincode);
			//System.out.println("Owner name is "+this.temporaryAddress.city);
			temporaryAddress.show();
		}
		System.out.println("Starting show in Owner");
	}
}
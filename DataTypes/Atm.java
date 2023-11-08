class Atm{
	
	String bankName;
	String[] branch;
	String[] acs;
	String[] cctvBrands;
	
	Atm(){
		
		System.out.println("created Atm with no argument");
	}
	
	void setBranch(String[] branch){
		this.branch=branch;
	}
	
	void setAcs(String[] acs){
		this.acs=acs;
	}
	
	void setCctvBrands(String[] cctvBrands){
		this.cctvBrands=cctvBrands;
	}
	
	void displayInfo(){
		
		System.out.println("Starting displayInfo in Atm");
		System.out.println("Bank name is "+this.bankName);
		
		System.out.println("Bank branch is "+this.branch);
		if(this.branch!=null){
		for(int seq=0;seq<this.branch.length;seq++){
			
			String ref=this.branch[seq];
			System.out.println("bank branch are "+this.branch[seq]+" at the seq "+seq);
		}
		}
		
		System.out.println("Bank acs is "+this.acs);
		if(this.acs!=null){
		for(int seq=0;seq<this.acs.length;seq++){
			
			String ref=this.acs[seq];
			System.out.println("atm acs are "+this.acs[seq]+" at the seq "+seq);
		}
		}
		
		System.out.println("Bank cctvBrands is "+this.cctvBrands);
		if(this.cctvBrands!=null){
		for(int seq=0;seq<this.cctvBrands.length;seq++){
			
			String ref=this.cctvBrands[seq];
			System.out.println("atm cctvBrands are "+this.cctvBrands[seq]+" at the seq "+seq);
		}
		}
		
		System.out.println("Starting displayInfo in Atm");
	}
}


class Bakery{
	
	static String name;
	static String[] biscuits;
	static long[] contacNo;
	static String[] machines;
	static boolean locked;
	static String[] cakes;
	static String[] chocolates;
	
	
	static void setName(String name){
		
		Bakery.name=name;
	}
	
	static void setBiscuits(String[] biscuits){
		
		Bakery.biscuits=biscuits;
	}
	
	static void setContactNO(long[] contacNo){
		
		Bakery.contacNo=contacNo;
	}
	
	static void setMachines(String[] machines){
		
		Bakery.machines=machines;
	}
	
	static void setLocked(boolean locked){
		
		Bakery.locked=locked;
	}
	
	static void setCakes(String[] cakes){
		
		Bakery.cakes=cakes;
	}
	
	static void setChocolates(String[] chocolates){
		
		Bakery.chocolates=chocolates;
	}
	
	static void locking(){
		System.out.println("displaying the locked");
		if(locked==true){
			
			System.out.println("Bakery is locked");
		}
		else{
			System.out.println("Bakery is open");
		}
		
	}
	static void displayInfo(){
		
		System.out.println("Starting of displayng bakery");
		
		System.out.println("name of the bakery is :"+name);
		
		System.out.println("displaying the biscuits");
		for(int index=0;index<biscuits.length;index++){
			String ref=biscuits[index];
			System.out.println("biscuits at index " +index+" are " +ref);
			
		}
		
		System.out.println("displaying the contactno");
		for(int index=0;index<contacNo.length;index++){
			long ref=contacNo[index];
			System.out.println("contacts from index " +index+" are " +ref);
			
		}
		
		System.out.println("displaying the Machines");
		for(int index=0;index<machines.length;index++){
			String ref=machines[index];
			System.out.println("Machines at index " +index+" are " +ref);
			
		}
		
		
		
		System.out.println("displaying the Cakes");
		for(int index=0;index<cakes.length;index++){
			String ref=cakes[index];
			System.out.println("Cakes at index " +index+" are " +ref);
			
		}
		
		System.out.println("displaying the Chocolates");
		for(int index=0;index<chocolates.length;index++){
			String ref=chocolates[index];
			System.out.println("Cakes at index " +index+" are " +ref);
			
		}
		
		System.out.println("Ending of displayng bakery");
		
	}
	
}
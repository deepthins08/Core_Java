class FreeStarter{
	
	public static void main(String[] isfree){
		
		System.out.println("Starting main in FreeStarter");
		
		Free free=new Free("Pizza","LuckyCoupon",false);
		free.displayInfo();
		
		Free free1=new Free("Car","LuckyDraw",false);
		free1.displayInfo();
		
		Free free2=new Free("Course","Campus",false);
		free2.displayInfo();
		
		Free free3=new Free("Juice","FestivalOffer",false);
		free3.displayInfo();
		
		Free free4=new Free("Pizza","LuckyCoupon",false);
		free4.displayInfo();
		
		Free free5=new Free("Wifi","to work",false);
		free5.displayInfo();
		
		Free free6=new Free("Water","by Gov.",true);
		free6.displayInfo();
		
		Free free7=new Free("Air","to live",true);
		free7.displayInfo();
		
		Free free8=new Free("Paretns love","we are there offspring",true);
		free8.displayInfo();
		
		Free free9=new Free("Bus Ride for Womens","Gov Orders",true);
		free9.displayInfo();
		
		Free free10=new Free("rain","by nature",true);
		free10.displayInfo();
		
		Free free11=new Free("Sun light","by nature",true);
		free11.displayInfo();
		
		System.out.println("Ending main in FreeStarter");
	}
}
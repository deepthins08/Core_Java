class RestaurantStarter{
	
	public static void main(String[] items){
		
		System.out.println("Starting main in RestaurantStarter");
		String[] specialItems=new String[5];
		
		specialItems[0]="Steak";
		specialItems[1]="Veg Roll";
		specialItems[2]="Vada Pav";
		specialItems[3]="Corn cheese noodles";
		specialItems[4]="Gobi65";
		

		System.out.println(specialItems);
		Restaurant restaurant=new Restaurant(specialItems);
		restaurant.displayInfo();
		
		
		System.out.println("Starting main in RestaurantStarter");
	}
}
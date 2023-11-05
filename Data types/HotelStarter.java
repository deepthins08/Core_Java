class HotelStarter{
	
	public static void main(String[] items){
		
		System.out.println("Starting main in HotelStarter");
		MenuCard menucard=new MenuCard(5,548);
		Hotel hotel=new Hotel();
		hotel.setValues("Food land","Kelvin",menucard);
		hotel.showInfo();
		
		
		System.out.println("Starting main in HotelStarter");
	}
}
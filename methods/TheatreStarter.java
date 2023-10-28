class TheatreStarter{
	
	public static void main(String[] args){
		
		
		System.out.println("Staring main in TheatreStarter");
		String person=Person.bookTicket(null,0);
		System.out.println(person);
		System.out.println("\n");
		person=Person.bookTicket("Leo",3);
		System.out.println(person);
		System.out.println("Ending in TheatreStarter");
	}
}
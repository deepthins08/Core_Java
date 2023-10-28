class MovieStarter{
	
	public static void main(String[] watch){
		
		System.out.println("starting main in MovieStarter");
		System.out.println("\n");
		Movie.buyTicket("Avengers",5);
		System.out.println("\n");
		Movie.buyTicket("Jawan",15);
		System.out.println("\n");
		Movie.cancelTicket("Bahubali",7,2);
		System.out.println("\n");
		Movie.cancelTicket("Barbygirl",15,29);
		System.out.println("\n");
		
		Movie.bookTicket("Mona","English",4,true);
		System.out.println("\n");
		Movie.bookTicket("MazeRunner","English",15,false);
		System.out.println("\n");
		
		System.out.println("ending main in MovieStarter");
	}
}
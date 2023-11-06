class Player{
	
	String name;
	Game game;
	
	
	Player(String name,Game game){
		this.name=name;
		this.game=game;
	}
	void playGame(){
		System.out.println("Starting play in Player");
		System.out.println("Displaying play from Game");
		game.play();
		System.out.println("Starting play in Player");
	}
	
	void pauseGame(){
		System.out.println("Starting pause in Player");
		System.out.println("Displaying pause from Game");
		game.pause();
		System.out.println("Starting pause in Player");
	}
	
	void endGame(){
		System.out.println("Starting end in Player");
		System.out.println("Displaying end from Game");
		game.end();
		System.out.println("Starting end in Player");
		
	}
	
	void showInfo(){
		
		System.out.println("Starting showInfo in Player");
		System.out.println("player name is "+name);
		System.out.println("player Game is "+game);
		if(game!=null){
			System.out.println("game id is "+game.id);
			System.out.println("game name is "+game.name);
			System.out.println("game origin is "+game.origin);
			System.out.println("game totalPlayers is "+game.totalPlayers);
		}
		
		System.out.println("Starting showInfo in Player");
	}
}
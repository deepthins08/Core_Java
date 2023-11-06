class Starter{
	
	public static void main(String[] apply){
		
		System.out.println("Starting main in Starter");
		System.out.println("Starting Tent");
		Color color=Color.RED;
		Tent tent=new Tent();
		Agent agent=new Agent();
		tent.showInfo(23,color,35,50);
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
		System.out.println("Ending Tent");
		
		System.out.println("Starting Game");
		TotalPlayers totalPlayers=TotalPlayers.HUNDERED;
		Game game=new Game(20,"Football",totalPlayers,"Outdoor");
		Player player=new Player("Richard",game);
		
		game.showInfo();
		player.showInfo();
		player.playGame();
		player.pauseGame();
		player.endGame();
		
		System.out.println("Starting main in Starter");
	}

}
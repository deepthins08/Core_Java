class Game{
	
	int id;
	String name;
	TotalPlayers totalPlayers;
	String origin;
	
	Game(int id,String name,TotalPlayers totalPlayers,String origin){
		this.id=id;
		this.name=name;
		this.totalPlayers=totalPlayers;
		this.origin=origin;
	}
	
	void play(){
		
		System.out.println("Starting play in Game");
	}
	
	void pause(){
		System.out.println("Starting pause in Game");
	}
	
	void end(){
		System.out.println("Starting end in Game");
	}
	
	void showInfo(){
		System.out.println("Starting showInfo in Game");
		System.out.println("Game id is "+id);
		System.out.println("Game name is "+name);
		System.out.println("Game totalPlayers is "+totalPlayers);
		
		if(totalPlayers!=null){
			System.out.println("Game totalPlayers is "+totalPlayers.HUNDERED);
		}
		System.out.println("Game origin is "+origin);
		
		System.out.println("Starting showInfo in Game");
		
	}
}
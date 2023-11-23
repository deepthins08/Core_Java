class MediaPlayer extends StandaloneApplication{
	
	String[] favourites;
	
	MediaPlayer(String name,AppType type){
		super(name,type);
		System.out.println("Created String,AppType const in MediaPlayer");
		
	}
	
	void show(){
		
		
		play();
		delete();
		download();
	}
	
	void setFavourites(String[] favourites){
		
		this.favourites=favourites;
		for(int seq=0;seq<favourites.length;seq++){
			
			String fav=favourites[seq];
			System.out.println("favourites are "+favourites[seq]+" at seq"+seq);
		}
	}
	
	void play(){
		
		System.out.println("Displaying play in MediaPlayer");
	}
	
	void delete(){
		
		System.out.println("Displaying delete in MediaPlayer");
	}
	
	void download(){
		System.out.println("Displaying download in MediaPlayer");
		
	}
}
class TvStarter{

public static void main(String[] speakers){
	
	System.out.println("Starting main in TvStarter");
	Speaker speaker=new Speaker(100);
	Tv tv=new Tv("Displaying video",speaker);
     tv.showInfo();
	System.out.println("Starting main in TvStarter");
}


}
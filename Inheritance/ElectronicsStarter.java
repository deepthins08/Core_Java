class ElectronicsStarter{
	
	public static void main(String[] elec){
		
		System.out.println("Starting main in ElectronicsStarter");
		
		Electronics electronics=new Electronics();
		Electronics electronics1=new Tv();
		Electronics electronics2=new ColorTv();
		Electronics electronics3=new AndroidTv();
		Electronics electronics4=new MiTv();
		
		Tv tv=new Tv();
		Tv tv1=new ColorTv();
		Tv tv2=new AndroidTv();
		Tv tv3=new MiTv();
		
		ColorTv color=new ColorTv();
		ColorTv color1=new AndroidTv();
		ColorTv color2=new MiTv();
		
		AndroidTv androidtv=new AndroidTv();
		AndroidTv androidtv1=new MiTv();
		
		MiTv mitv=new MiTv();
		
		System.out.println("Ending main in ElectronicsStarter");
	}
	
}
class GlassStarter{
	
	public static void main(String... glasses){
		
		System.out.println("Starting main in GlassStarter");
		
		GorillaGlass gorillaglass=new GorillaGlass(14,true);
		gorillaglass.setValues(1000,2);
		gorillaglass.setType(GlassType.LAMINATED);
		gorillaglass.setValues("Windows","Luxe");
		
		TintedGlass tintedglass=new TintedGlass(15,true);
		tintedglass.setValues(40,"Shawn");
		
		tintedglass.setType(GlassType.LAMINATED);
		tintedglass.setValues("Windows","Luxe");
		
		
		System.out.println("Ending main in GlassStarter");
	}
}
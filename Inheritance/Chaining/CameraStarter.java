class CameraStarter{
	
	public static void main(String... click){
		
		System.out.println("Starting main in CameraStarter");
		
		DigitalCamera digitalcamera=new DigitalCamera("Canon",26.2,7);
		digitalcamera.setColor(ColorType.BLACK);
		
		HandCamera handcamera=new HandCamera("Nikon Z6",24.5,4);
		handcamera.setColor(ColorType.GRAY);
		handcamera.setWeight(200);
		
		System.out.println("Ending main in CameraStarter");
		
	}
}
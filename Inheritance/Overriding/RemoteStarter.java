class RemoteStarter{
	
	public static void main(String... operate){
		
		System.out.println("Starting main in RemoteStarter");
		
		LgRemote lgremote=new LgRemote(50,true);
		lgremote.setUsedFor(Usage.TV);
		lgremote.on();
		lgremote.off();
		lgremote.increaseVolume();
		lgremote.decreaseVolume();
		lgremote.changeChannel();
		lgremote.setValues(2,2);
		lgremote.voiceCommand();
		
		System.out.println("Ending main in RemoteStarter");
	}
}
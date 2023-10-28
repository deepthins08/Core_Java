class Deepthi{
	
	public static void main(String[] values){
		
		System.out.println("Starting Main method for Cup");
		Cup.cupInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Cup.size="Large";
	    Cup.cost=200.0;
	    Cup.color="white";
	    Cup.quantity=200;
	    Cup.type="marbel";
		Cup.cupInfo();
		System.out.println("Ending Main method for Cup");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Cloth");
		Cloth.clothInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Cloth.size="XL";
	    Cloth.cost=500.0;
	    Cloth.color="Brown";
	    Cloth.brand="Mufti";
	    Cloth.type="nylon";
		Cloth.clothInfo();
		System.out.println("Ending Main method for Cloth");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Slipper");
		Slipper.slipperInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Slipper.brand="Nike";
	    Slipper.color="black";
	    Slipper.pattern="Shoe";
	    Slipper.size=9;
	    Slipper.cost=1000.0;
		Slipper.slipperInfo();
		System.out.println("Ending Main method for Slipper");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Window");
		Window.windowInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Window.height=10;
	    Window.width=8;
	    Window.pattern="rectangle";
	    Window.color="gray";
	    Window.design="plain";
		Window.windowInfo();
		System.out.println("Ending Main method for Window");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Metal");
		Metal.metalInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Metal.weight=20;
	    Metal.type="Gold";
	    Metal.design="Neclace";
	    Metal.cost=100000;
	    Metal.color="Gold";
		Metal.metalInfo();
		System.out.println("Ending Main method for Metal");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Jar");
		Jar.jarInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Jar.color="red";
	    Jar.type="ceramic";
	    Jar.weight=6;
	    Jar.height=3;
	    Jar.cost=79;
		Jar.jarInfo();
		System.out.println("Ending Main method for Jar");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Socket");
		Socket.socketInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Socket.brand="roma";
	    Socket.cost=599;
	    Socket.quantity=3;
	    Socket.type="threepin";
	    Socket.color="black";
		Socket.socketInfo();
		System.out.println("Ending Main method for Jar");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Kerchief");
		Kerchief.kerchiefInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Kerchief.cost=899;
		Kerchief.color="black";
		Kerchief.brand="Peter England";
	    Kerchief.quantity=3;
	    Kerchief.madein="USA";
		Kerchief.kerchiefInfo();
		System.out.println("Ending Main method for Kerchief");
		System.out.println("\n");
		
		System.out.println("Starting Main method for Wallet");
		Wallet.walletInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    Wallet.cost=99;
		Wallet.material="leather";
		Wallet.width=11.5;
	    Wallet.height=7;
	    Wallet.weight=100;
		Wallet.walletInfo();
		System.out.println("Ending Main method for Wallet");
		System.out.println("\n");
		
		System.out.println("Starting Main method for AirPod");
		AirPod.airpodInfo();
		System.out.println("\n");
		System.out.println("reinitialising the variables");
	    AirPod.color="pink";
		AirPod.design="earbuds";
		AirPod.quantity=1;
	    AirPod.type="on the ear";
	    AirPod.connectivity="bluetooth";
		AirPod.airpodInfo();
		System.out.println("Ending Main method for Airpod");
		System.out.println("\n");
		
	}
}
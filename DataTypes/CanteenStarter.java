class CanteenStarter{
	
	
	public static void main(String[] utense){
		
		System.out.println("Starting main in CanteenStarter");
		String[] utensils=new String[40];
		utensils[0]="Chef's Knife";
		utensils[1]="pairing Knife";
		utensils[2]="Honing";
		utensils[3]="rod";
		utensils[4]="Bread Knife";
		utensils[5]="Chopping board";
		utensils[6]="scissors";
		utensils[7]="vegetable peeler";
		utensils[8]="garlic press";
		utensils[9]="Grater";
		utensils[10]="kitchen scales";
		utensils[11]="measuring jug";
		utensils[12]="measuring spoons";
		utensils[13]="measuring cups";
		utensils[14]="mixing bowl";
		utensils[15]="pasta strainer";
		utensils[16]="Sieve";
		utensils[17]="Rolling pin";
		utensils[18]="Can opener";
		utensils[19]="blender";
		utensils[20]="Ladle";
		utensils[21]="fork";
		utensils[22]="pizza cutter";
		utensils[23]="corkscrew";
		utensils[24]="bottle opener";
		utensils[25]="flying pan";
		utensils[26]="sausepans";
		utensils[27]="ovenproof dish";
		utensils[28]="baking sheet";
		utensils[29]="stirring spoon";
		utensils[30]="slotted spoon";
		utensils[31]="spatula";
		utensils[32]="tongs";
		utensils[33]="masher";
		utensils[34]="oven gloves";
		utensils[35]="pot holders";
		utensils[36]="bread bin";
		utensils[37]="kitchen foil";
		utensils[38]="tea towels";
		utensils[39]="food thermometer";
		
		Canteen canteen=new Canteen();
		canteen.setUtensils(utensils);
		canteen.displayInfo();
		
		
		System.out.println("Starting main in CanteenStarter");
	}
}
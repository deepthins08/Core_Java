class AtmStarter{
	
	public static void main(String[] money){
		
		System.out.println("Starting main in AtmStarter");
		String[] branch=new String[5];
		branch[0]="BTM";
		branch[1]="Malleshwaram";
		branch[2]="Marattalli";
		branch[3]="Hebbal";
		branch[4]="Jaynagar";
		
		String[] acs=new String[3];
		acs[0]="Lg";
		acs[1]="Godreg";
		acs[2]="whirlpool";
		
		String[] cctvBrands=new String[5];
		cctvBrands[0]="Qubo";
		cctvBrands[1]="Mi";
		cctvBrands[2]="CP Plus";
		cctvBrands[3]="Hik Vision";
		cctvBrands[4]="TP-Link";
		
		Atm atm=new Atm();
		
		atm.setBranch(branch);
		atm.setAcs(acs);
		atm.setCctvBrands(cctvBrands);
		atm.displayInfo();
		System.out.println("Ending main in AtmStarter");
	}
}
class PrinterStarter{
	
	public static void main(String[] printing){
		
		System.out.println("Starting main in PrinterStarter");
		
		Printer printer=new Printer();
		System.out.println("Printer printingMethod is: "+printer.printingMethod);
		System.out.println("Printer type is: "+printer.type);
		System.out.println("Printer modelName is: "+printer.modelName);
		System.out.println("Printer multiCopyInPages is: "+printer.multiCopyInPages);
		System.out.println("Printer wireless is: "+printer.wireless);
		
		Printer printer1=new Printer("InkJet");
		System.out.println("Printer1 printingMethod is: "+printer1.printingMethod);
		System.out.println("Printer1 type is: "+printer1.type);
		System.out.println("Printer1 modelName is: "+printer1.modelName);
		System.out.println("Printer1 multiCopyInPages is: "+printer1.multiCopyInPages);
		System.out.println("Printer1 wireless is: "+printer1.wireless);
		
		Printer printer2=new Printer("InkJet","Single Function");
		System.out.println("Printer2 printingMethod is: "+printer2.printingMethod);
		System.out.println("Printer2 type is: "+printer2.type);
		System.out.println("Printer2 modelName is: "+printer2.modelName);
		System.out.println("Printer2 multiCopyInPages is: "+printer2.multiCopyInPages);
		System.out.println("Printer2 wireless is: "+printer2.wireless);
		
		Printer printer3=new Printer("InkJet","Single Function","PXMA TS207");
		System.out.println("Printer3 printingMethod is: "+printer3.printingMethod);
		System.out.println("Printer3 type is: "+printer3.type);
		System.out.println("Printer3 modelName is: "+printer3.modelName);
		System.out.println("Printer3 multiCopyInPages is: "+printer3.multiCopyInPages);
		System.out.println("Printer3 wireless is: "+printer3.wireless);
		
		Printer printer4=new Printer("InkJet","Single Function","PXMA TS207",1);
		System.out.println("Printer4 printingMethod is: "+printer4.printingMethod);
		System.out.println("Printer4 type is: "+printer4.type);
		System.out.println("Printer4 modelName is: "+printer4.modelName);
		System.out.println("Printer4 multiCopyInPages is: "+printer4.multiCopyInPages);
		System.out.println("Printer4 wireless is: "+printer4.wireless);
		
		Printer printer5=new Printer("InkJet","Single Function","PXMA TS207",1,false);
		System.out.println("Printer5 printingMethod is: "+printer5.printingMethod);
		System.out.println("Printer5 type is: "+printer5.type);
		System.out.println("Printer5 modelName is: "+printer5.modelName);
		System.out.println("Printer5 multiCopyInPages is: "+printer5.multiCopyInPages);
		System.out.println("Printer5 wireless is: "+printer5.wireless);
		
		System.out.println("Ending main in PrinterStarter");		
	}
}
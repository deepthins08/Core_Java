class Printer{
	
	String printingMethod;
	String type;
	String modelName;
	int multiCopyInPages;
	boolean wireless;
	
	Printer(){
		
		this("inkjet","Multi-Function","DeskJet2723",9,true);
		System.out.println("invoked no-argument constructor");
	}
	
	Printer(String printingMethod){
		this.printingMethod=printingMethod;
		System.out.println("Invoked String argument "+printingMethod);
		
	}
	
	Printer(String printingMethod,String type){
		this(printingMethod);
		this.type=type;
		System.out.println("Invoked String,String argument "+printingMethod+","+type);
		
	}
	
	Printer(String printingMethod,String type,String modelName){
		this(printingMethod,type);
		this.modelName=modelName;
		System.out.println("Invoked String,String,String argument "+printingMethod+","+type+","+modelName);
		
	}
	
	Printer(String printingMethod,String type,String modelName,int multiCopyInPages){
		this(printingMethod,type,modelName);
		this.multiCopyInPages=multiCopyInPages;
		System.out.println("Invoked String,String,String,int argument "+printingMethod+","+type+","+modelName+","+multiCopyInPages);
		
	}
	
	Printer(String printingMethod,String type,String modelName,int multiCopyInPages,boolean wireless){
		this(printingMethod,type,modelName,multiCopyInPages);
		this.wireless=wireless;
		System.out.println("Invoked String,String,String,int,boolean argument "+printingMethod+","+type+","+modelName+","+multiCopyInPages+","+wireless);
		
	}
}